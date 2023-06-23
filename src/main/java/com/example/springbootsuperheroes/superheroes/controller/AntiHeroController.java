package com.example.springbootsuperheroes.superheroes.controller;


import com.example.springbootsuperheroes.superheroes.entity.AntiHeroEntity;
import com.example.springbootsuperheroes.superheroes.service.AntiHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/antiHero")
public class AntiHeroController  {

    private final AntiHeroService antiHeroService;

    public AntiHeroController(AntiHeroService antiHeroService) {
        this.antiHeroService = antiHeroService;
    }

    @PostMapping
    public ResponseEntity<?> saveAntiHero(@RequestBody AntiHeroEntity antiHero) {
        return new ResponseEntity<>(antiHeroService.saveAntiHero(antiHero), HttpStatus.CREATED);
    }

    @DeleteMapping("{antiHeroId}")
    public ResponseEntity<?> deleteAntiHero(@PathVariable Long antiHeroId) {

        antiHeroService.deleteAntiHero(antiHeroId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllAntiHero() {
        return ResponseEntity.ok(antiHeroService.findAllAntiHero());
    }
}
