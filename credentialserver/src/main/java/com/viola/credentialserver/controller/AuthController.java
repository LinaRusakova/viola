package com.viola.credentialserver.controller;

import com.viola.credentialserver.model.UserCredential;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.viola.credentialserver.service.UserService;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
public class AuthController {
    @Autowired
    private UserService userService;


    private final CredentialManager credentialManager;

    @GetMapping("/users/getstr")
    public ResponseEntity<String> getStringUsers() {
        return ResponseEntity.ok(credentialManager.getStringUsers());
//        return ResponseEntity.ok(userService.findAll());
//        return new HashMap<String, String>() {{
//            put(login, password);
//        }};

    }

    public ResponseEntity<List<UserCredential>> getAllUsers() {
        return ResponseEntity.ok(credentialManager.getAllUsers());
//        return ResponseEntity.ok(userService.findAll());
//        return new HashMap<String, String>() {{
//            put(login, password);
//        }};

    }

    @RequestMapping("/add")
    public ResponseEntity<Map<String, String>> addUser(@RequestParam String login, @RequestParam String password) {
        return ResponseEntity.ok(userService.addUserCredential(login, password));
//        return new HashMap<String, String>() {{
//            put(login, password);
//        }};

    }
}
