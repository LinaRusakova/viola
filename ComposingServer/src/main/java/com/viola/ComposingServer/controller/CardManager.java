package com.viola.ComposingServer.controller;

import com.viola.ComposingServer.dto.CardDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface CardManager {

    @RequestMapping(value = "card/{id}", method = RequestMethod.GET, produces = "application/json")
    public CardDTO getOneCardDto();

    @RequestMapping(value = "cards/", method = RequestMethod.GET, produces = "application/json")
    public List<CardDTO>   getListCardDto();

    @RequestMapping(value = "card/{id}", method = RequestMethod.POST, produces = "application/json")
    public CardDTO addOneCardDto();

    @RequestMapping(value = "cards/", method = RequestMethod.PUT, produces = "application/json")
    public CardDTO updateCardDto();

}
