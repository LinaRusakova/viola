package com.viola.ComposingServer.controller;

import com.viola.ComposingServer.dto.CardDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@RequestMapping(value = "card-manager")
public interface CardManager {

    @RequestMapping(value = "cards/{id}", method = RequestMethod.GET, produces = "application/json")
    @Operation(summary = "Get one card by cardID")
    CardDTO getCardDTO();

    @RequestMapping(value = "cards", method = RequestMethod.GET, produces = "application/json")
    @Operation(summary = "Get all cards")
    List<CardDTO> getListCardDto();

    @RequestMapping(value = "cards/", method = RequestMethod.POST, produces = "application/json")
    @Operation(summary = "Add new one card")
    CardDTO addCardDto();

    @RequestMapping(value = "cards/{id}", method = RequestMethod.PUT, produces = "application/json")
    @Operation(summary = "Change one card by cardID")
    CardDTO updateCardDto();

    @RequestMapping(value = "cards/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @Operation(summary = "Delete one card by cardID")
    CardDTO deleteCardDto();

}
