package com.football.tournoi.controllers;


import com.football.tournoi.entities.Joueur;
import com.football.tournoi.services.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class JoueurController {

    @Autowired
    JoueurService joueurService;

    @GetMapping("joueur")
    public List<Joueur> getAllJoueurs() {
        return joueurService.getAllJoueures();
    }
    @PostMapping("joueur")
    public Joueur addJoueur(@RequestBody Joueur joueur){
        return joueurService.addJoueur(joueur);
    }

    @DeleteMapping("joueur/{id}")
    public void deleteJoueur(@PathVariable Long id){
         joueurService.deleteJoueur(id);
    }
    @GetMapping("joueur/{id}")
    public Joueur getJoueurById(@PathVariable Long id) {
        return joueurService.getJoueurById(id);
    }

    @GetMapping("joueur/equipe/{nom}")
    public List<Joueur> getJoueurByNomEquipe(@PathVariable String nom) {
        return joueurService.getJoueurByNomEquipe(nom);
    }
    @GetMapping("joueur/equipe/{nom}/{poste}")
    public List<Joueur> getJoueurByNomEquipeAndPost(@PathVariable String nom , @PathVariable String poste) {
        return joueurService.getJoueurByNomEquipeAndPost(nom,poste);
    }

}