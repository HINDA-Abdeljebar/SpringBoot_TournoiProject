package com.football.tournoi.controllers;


import com.football.tournoi.entities.Joueur;
import com.football.tournoi.repositories.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class JoueurController {

    @Autowired
    JoueurRepository joueurRepository;

    @GetMapping("joueur")
    public List<Joueur> getAllJoueures() {
        return joueurRepository.findAll();
    }
    @PostMapping("joueur")
    public Joueur addJoueur(@RequestBody Joueur joueur){
        return joueurRepository.save(joueur);
    }

    @DeleteMapping("joueur/{id}")
    public void deleteJoueur(@PathVariable Long id){
         joueurRepository.deleteById(id);
    }
    @GetMapping("joueur/{id}")
    public Joueur getJoueurById(@PathVariable Long id) {
        return joueurRepository.findById(id).get();
    }

}