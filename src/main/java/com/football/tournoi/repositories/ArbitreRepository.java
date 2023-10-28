package com.football.tournoi.repositories;

import com.football.tournoi.entities.Arbitre;
import com.football.tournoi.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbitreRepository extends JpaRepository<Arbitre, Long> {
}
