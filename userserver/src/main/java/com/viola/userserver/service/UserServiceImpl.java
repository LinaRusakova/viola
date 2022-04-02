package com.viola.userserver.service;

import com.viola.userserver.model.UserCredential;
import com.viola.userserver.repository.CredentialRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final CredentialRepository credentialRepository;

    public UserServiceImpl(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    @Override
    public Map<String, String> addUserCredential(String login, String password) {
        UserCredential userCredential=new UserCredential(login, password);

        credentialRepository.save(userCredential);
        return new HashMap<>(){{put(userCredential.getClientToken(), userCredential.getCompositeToken());}};
    }

    @Override
    public List<UserCredential> findAll() {
        return credentialRepository.findAll();
    }
}
