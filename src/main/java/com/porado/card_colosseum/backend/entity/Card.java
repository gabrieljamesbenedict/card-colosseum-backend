package com.porado.card_colosseum.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@RequiredArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int manaCost;

    @Column(nullable = false)
    private int attackPower;

    @Column(nullable = false)
    private int defensePower;

    @Column(nullable = true)
    private String ability;

}
