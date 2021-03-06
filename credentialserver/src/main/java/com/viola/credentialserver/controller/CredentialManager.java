package com.viola.credentialserver.controller;

import com.viola.credentialserver.model.UserCredential;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping(value = "credential-manager")
@FeignClient(name = "userserver" , url="http://localhost:8602/user")
public interface CredentialManager {

    @GetMapping(value = "/users/get")
    List<UserCredential> getAllUsers();

    @GetMapping(value = "/users/getstr")
    String getStringUsers();
}
