package com.football.tournoi.controllers;


import com.football.tournoi.entities.Equipe;
import com.football.tournoi.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EquipeController {

    @Autowired
    EquipeRepository equipeRepository;

    @GetMapping("equipe")
    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }
    @PostMapping("equipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeRepository.save(equipe);
    }

    @DeleteMapping("equipe/{id}")
    public void deleteEquipe(@PathVariable Long id){
         equipeRepository.deleteById(id);
    }
    @GetMapping("equipe/{id}")
    public Equipe getEquipeById(@PathVariable Long id) {
        return equipeRepository.findById(id).get();
    }
    @GetMapping("equipe/pays/{pays}")
    public List<Equipe> getEquipeByPays(@PathVariable String pays) {
        return equipeRepository.findByPays(pays);
    }
    @GetMapping("equipe/match/{id}")
    public List<Equipe> getEquipesBymatchId(@PathVariable Long id) {
        return equipeRepository.findByMatchesIdMatch(id);
    }

}