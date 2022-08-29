package com.viola.ComposingServer.controller;

import com.viola.ComposingServer.dto.CardDTO;
import com.viola.ComposingServer.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mediatype.problem.Problem;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CardController implements CardManager {
    private final CardService cardService;

    @Override
    public CardDTO getCardDTO(@PathVariable("id") UUID id) {
//        cardService.getCardDTO(id);

        CardDTO result = new CardDTO();
        result.setId(id);
        result.setCardTitle("Hello!");
        result.setCardImageAlterText("Подписи к фото, альтер текст");
        result.setCardDescription("Это описание к фото получено с сервера");
        return result;
    }

    @Override
    public List<CardDTO> getListCardDto() {
        return null;
    }

    @Override
    public ResponseEntity<Object> addCard(@Valid @RequestBody CardDTO cardDTO, BindingResult result) throws UnsupportedOperationException {

        if (result.hasErrors()) {
            List<String> errors = result.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        } else {
            if (cardService.getCardDTOById(cardDTO.getId()) != null) {
                return new ResponseEntity<>(
                        Collections.singletonList("Карточка уже существует"),
                        HttpStatus.CONFLICT);
            } else {
                cardService.addNewCard(cardDTO);
                return ResponseEntity.status(HttpStatus.CREATED)
                        .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
                        .body(Problem.create()
                                .withTitle("Всё ОК")
                                .withDetail("Ваша карточка успешно загружена"));
            }
        }
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
