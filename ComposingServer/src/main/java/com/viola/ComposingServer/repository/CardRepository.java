package com.viola.ComposingServer.repository;

import com.viola.ComposingServer.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
