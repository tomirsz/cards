package com.cards.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardDto {

    private Long id;
    private String cardNumber;
    private String cardType;
    private Long customerId;
}
