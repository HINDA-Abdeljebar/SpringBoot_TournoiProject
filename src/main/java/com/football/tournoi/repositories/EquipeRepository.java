package com.football.tournoi.repositories;

import com.football.tournoi.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    List<Equipe> findByPays(String nom); //Pour récupérer toutes les équipes d'un pays données
    List<Equipe> findByMatchesIdMatch(Long id); //Pour récupérer les deux équipes d'un match

}
