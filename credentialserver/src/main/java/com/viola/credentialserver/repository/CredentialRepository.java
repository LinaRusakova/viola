package com.viola.credentialserver.repository;

import com.viola.credentialserver.model.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CredentialRepository extends JpaRepository<UserCredential, UUID> {

}