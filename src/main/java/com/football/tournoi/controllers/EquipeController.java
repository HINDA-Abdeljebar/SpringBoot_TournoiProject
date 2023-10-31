package com.football.tournoi.controllers;


import com.football.tournoi.entities.Equipe;
import com.football.tournoi.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @GetMapping("equipe")
    public List<Equipe> getAllEquipes() {
        return equipeService.getAllEquipees();
    }
    @PostMapping("equipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }

    @DeleteMapping("equipe/{id}")
    public void deleteEquipe(@PathVariable Long id){
         equipeService.deleteEquipe(id);
    }
    @GetMapping("equipe/{id}")
    public Equipe getEquipeById(@PathVariable Long id) {
        return equipeService.getEquipeById(id);
    }
    @GetMapping("equipe/pays/{pays}")
    public List<Equipe> getEquipeByPays(@PathVariable String pays) {
        return equipeService.getEquipeByPays(pays);
    }
    @GetMapping("equipe/match/{id}")
    public List<Equipe> getEquipesBymatchId(@PathVariable Long id) {
        return equipeService.getEquipesBymatchId(id);
    }

}