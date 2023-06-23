package com.example.springbootsuperheroes.superheroes.repository;

import com.example.springbootsuperheroes.superheroes.entity.AntiHeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AntiHeroRepository extends JpaRepository<AntiHeroEntity, Long> {
}
