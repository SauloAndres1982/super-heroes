package com.example.springbootsuperheroes.superheroes.service;

import com.example.springbootsuperheroes.superheroes.entity.AntiHeroEntity;
import com.example.springbootsuperheroes.superheroes.repository.AntiHeroRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AntiHeroServiceImpl implements AntiHeroService {

    private final AntiHeroRepository antiHeroRepository;

    public AntiHeroServiceImpl(AntiHeroRepository antiHeroRepository) {
        this.antiHeroRepository = antiHeroRepository;
    }

    @Override
    public AntiHeroEntity saveAntiHero(AntiHeroEntity antiHero) {

        antiHero.setCreatedAt(LocalDateTime.now());
        return antiHeroRepository.save(antiHero);

    }

    @Override
    public void deleteAntiHero(Long antiHeroid) {
        antiHeroRepository.deleteById(antiHeroid);
    }

    @Override
    public List<AntiHeroEntity> findAllAntiHero() {
        return antiHeroRepository.findAll();
    }
}
