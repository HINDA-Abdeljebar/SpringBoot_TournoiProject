package com.football.tournoi.repositories;

import com.football.tournoi.entities.Arbitre;
import com.football.tournoi.entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    // Récupérer tous les joueurs de l’équipe par son nom
    List<Joueur> findByEquipeNomEquipe(String nom);
    List<Joueur> findByEquipeNomEquipeAndPoste(String nom , String post);




}
