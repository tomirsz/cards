package com.cards.service;

import com.cards.mapper.CardsMapper;
import com.cards.model.dto.CardDto;
import com.cards.repository.CardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CardsService {

    private CardsRepository cardsRepository;
    private CardsMapper cardsMapper;

    public List<CardDto> fetchCardsByCustomerId(long customerId) {
        return cardsRepository.fetchCardsByCustomerId(customerId).stream()
                .map(c -> cardsMapper.mapToCardDto(c))
                .collect(Collectors.toList());
    }
}
