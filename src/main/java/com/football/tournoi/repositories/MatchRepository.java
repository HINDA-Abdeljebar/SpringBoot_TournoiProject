package com.football.tournoi.repositories;

import com.football.tournoi.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByDatematch(Date date); //Pour récupérer toutes les matches d'une date donnée.

}
