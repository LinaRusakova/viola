package com.viola.userserver.repository;

import com.viola.userserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String userName);

    Boolean existByUsername(String userName);

    Boolean existByEmail(String email);
}