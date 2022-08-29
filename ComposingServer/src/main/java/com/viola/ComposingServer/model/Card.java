package com.viola.ComposingServer.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
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
public class Card {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Column(length = 300)
    private String cardTitle;
    @Column(length = 1000)
    private String cardDescription;
    private String cardType; // todo convert to enum
    private String clientToken;

    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    private Date lastModifiedDate;
}
