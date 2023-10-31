package com.football.tournoi.services;


import com.football.tournoi.entities.Joueur;
import com.football.tournoi.repositories.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class JoueurService {

    @Autowired
    JoueurRepository joueurRepository;


    public List<Joueur> getAllJoueures() {
        return joueurRepository.findAll();
    }

    public Joueur addJoueur(Joueur joueur){
        return joueurRepository.save(joueur);
    }


    public void deleteJoueur(Long id){
        joueurRepository.deleteById(id);
    }

    public Joueur getJoueurById(Long id) {
        return joueurRepository.findById(id).get();
    }
    public List<Joueur> getJoueurByNomEquipe(String nom) {
        return joueurRepository.findByEquipeNomEquipe(nom);
    }
    public List<Joueur> getJoueurByNomEquipeAndPost(String nom , String poste) {
        return joueurRepository.findByEquipeNomEquipeAndPoste(nom,poste);
    }

}