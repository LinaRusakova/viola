package com.viola.credentialserver.controller;

import com.viola.credentialserver.model.UserCredential;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(name = "userserver" , url="http://localhost:8602/user")
public interface UserManager {
    @Operation(summary = "Get the user by his server-side token")
    @GetMapping(value = "/users/{token}")
    String getUserServerSideAllUsers();

    @GetMapping(value = "/users/getstr")
    String getStringUsers();
}
