package com.viola.userserver.controller;

import com.netflix.discovery.EurekaClient;
import com.viola.userserver.model.UserCredential;
import com.viola.userserver.service.UserService;
import com.viola.userserver.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor

public class AuthController {
@Autowired
    private EurekaClient eurekaClient;

    private final UserServiceImpl userService;

    @GetMapping("/users/get")
    public List<UserCredential> getAllUsers() {
        return userService.findAll();
//        return new HashMap<String, String>() {{
//            put(login, password);
//        }};

    }


    @GetMapping("/users/getstr")
    public String getStringUsers() {
        return userService.findAll().toString();
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
