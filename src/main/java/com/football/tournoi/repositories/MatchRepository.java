package com.football.tournoi.repositories;

import com.football.tournoi.entities.Equipe;
import com.football.tournoi.entities.Match;
import com.football.tournoi.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByDateMatch(Date date); //Pour récupérer toutes les matches d'une date donnée.
    void deleteByDateMatchLessThanAndHeureMatchLessThan(Date date, Time heure);



}
