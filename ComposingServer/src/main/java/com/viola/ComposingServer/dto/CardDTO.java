package com.viola.ComposingServer.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class CardDTO {

    private UUID id;
    private String cardTitle;
    private String cardType; // todo convert to enum
    private String clientToken;
    private String cardDescription;
    private String cardImageAlterText;

    @Column(updatable = false)
    private Date createDate;

    private Date lastModifiedDate;

}
