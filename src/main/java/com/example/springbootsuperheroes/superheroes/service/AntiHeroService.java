package com.example.springbootsuperheroes.superheroes.service;

import com.example.springbootsuperheroes.superheroes.entity.AntiHeroEntity;

import java.util.List;

public interface AntiHeroService {
    AntiHeroEntity saveAntiHero(AntiHeroEntity antiHero);

    void deleteAntiHero(Long antiHeroid);

    List<AntiHeroEntity> findAllAntiHero();
}
