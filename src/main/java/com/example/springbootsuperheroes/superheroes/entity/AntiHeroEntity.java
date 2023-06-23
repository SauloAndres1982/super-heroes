package com.example.springbootsuperheroes.superheroes.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "antihero")
public class AntiHeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", length = 150, nullable = false)
    private String firstName;

    @Column(name = "lastname", length = 150, nullable = false)
    private String lastName;

    @Column(name = "house", length = 200, nullable = false)
    private String house;

    @Column(name = "knownas", length = 140, nullable = false)
    private String knownAs;

    @Column(name = "fechaCreación")
    private LocalDateTime createdAt;
}
