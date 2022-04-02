package com.viola.ComposingServer.controller;

import com.viola.ComposingServer.dto.CardDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController implements CardManager{

    @Override
    public CardDTO getCardDTO() {
        return new CardDTO();
    }

    @Override
    public List<CardDTO> getListCardDto() {
        return null;
    }

    @Override
    public CardDTO addCardDto() {
        return null;
    }

    @Override
    public CardDTO updateCardDto() {
        return null;
    }

    @Override
    public CardDTO deleteCardDto() {
        return null;
    }
}
