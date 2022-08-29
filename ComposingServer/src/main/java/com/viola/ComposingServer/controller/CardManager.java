package com.viola.ComposingServer.controller;

import com.viola.ComposingServer.dto.CardDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping(value = "card-manager")
public interface CardManager {

    @RequestMapping(value = "cards/{id}", method = RequestMethod.GET, produces = "application/json")
    @Operation(summary = "Get one card by cardID")
    CardDTO getCardDTO(@PathVariable("id") UUID id);

    @RequestMapping(value = "cards", method = RequestMethod.GET, produces = "application/json")
    @Operation(summary = "Get all cards")
    List<CardDTO> getListCardDto();

    @RequestMapping(value = "cards/", method = RequestMethod.POST, produces = "application/json")
    @Operation(summary = "Add new one card")
    ResponseEntity<Object> addCard(@Valid @RequestBody CardDTO cardDTO, BindingResult result) throws UnsupportedOperationException;



    @RequestMapping(value = "cards/{id}", method = RequestMethod.PUT, produces = "application/json")
    @Operation(summary = "Change one card by cardID")
    CardDTO updateCardDto();

    @RequestMapping(value = "cards/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @Operation(summary = "Delete one card by cardID")
    CardDTO deleteCardDto();

}
