package com.cards.controller;

import com.cards.model.response.GetCardsResponse;
import com.cards.service.CardsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
@AllArgsConstructor
public class CardsController {

    private final CardsService cardsService;

    @GetMapping("/cards")
    public ResponseEntity<GetCardsResponse> getCards(@RequestParam(name = "customerId") long customerId) {
        return ResponseEntity.ok(GetCardsResponse.of(cardsService.fetchCardsByCustomerId(customerId)));
    }
}
