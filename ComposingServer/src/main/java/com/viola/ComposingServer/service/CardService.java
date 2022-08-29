package com.viola.ComposingServer.service;

import com.viola.ComposingServer.dto.CardDTO;
import com.viola.ComposingServer.model.Card;
import com.viola.ComposingServer.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final ModelMapper modelMapper;

    public CardDTO getCardDTOById(UUID id) {
        Card card = cardRepository.findById(id).orElseThrow(() -> new RuntimeException("Card is not exist"));
        return convertCardToCardDTO(card);
    }

    private CardDTO convertCardToCardDTO(Card card) {
        return modelMapper.map(card, CardDTO.class);
    }

    public void addNewCard(CardDTO cardDTO) {
        Card card= modelMapper.map(cardDTO, Card.class);
        cardRepository.save(card);
    }
}
