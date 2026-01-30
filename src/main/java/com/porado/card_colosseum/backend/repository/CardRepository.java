package com.porado.card_colosseum.backend.repository;

import com.porado.card_colosseum.backend.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
