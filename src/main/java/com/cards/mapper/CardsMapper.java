package com.cards.mapper;

import com.cards.model.dto.CardDto;
import com.cards.model.entity.Card;
import org.springframework.stereotype.Service;

@Service
public class CardsMapper {

    public CardDto mapToCardDto(Card card) {
        return CardDto.builder()
                .id(card.getId())
                .cardNumber(card.getCardNumber())
                .cardType(card.getCardType())
                .customerId(card.getCustomerId())
                .build();
    }
}
