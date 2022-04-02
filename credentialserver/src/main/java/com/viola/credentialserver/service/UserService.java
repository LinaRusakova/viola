package com.viola.credentialserver.service;

import com.viola.credentialserver.model.UserCredential;


import java.util.List;
import java.util.Map;

public interface UserService {
     Map<String, String> addUserCredential(String login, String password);

     List<UserCredential> findAll();
}
