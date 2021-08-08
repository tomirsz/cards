package com.cards.repository;

import com.cards.model.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CardsRepository extends JpaRepository<Card, Long> {

    @Query("FROM Card c where c.customerId =:customerId")
    List<Card> fetchCardsByCustomerId(@Param("customerId") Long customerId);
}
