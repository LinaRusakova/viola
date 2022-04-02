package com.viola.userserver.repository;

import com.viola.userserver.model.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CredentialRepository extends JpaRepository<UserCredential, UUID> {

}