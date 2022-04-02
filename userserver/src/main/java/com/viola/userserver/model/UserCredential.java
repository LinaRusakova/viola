package com.viola.userserver.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@AllArgsConstructor
public class UserCredential {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    private String login;
    private String password;
    private String clientToken;
    private String compositeToken;


    public UserCredential(String login, String password) {

        this.login = login;
        this.password = password;
        this.clientToken = login + password;
        this.compositeToken = login + password + new Date();
    }
}
