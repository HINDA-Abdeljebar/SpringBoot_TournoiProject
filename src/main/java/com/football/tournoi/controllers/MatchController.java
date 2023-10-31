package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.services.MatchService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping("match")
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }
    @PostMapping("match")
    public Match addMatch(@RequestBody Match match){
        return matchService.addMatch(match);
    }

    @DeleteMapping("match/{id}")
    public void deleteMatch(@PathVariable Long id){
         matchService.deleteMatch(id);
    }

    @GetMapping("match/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }


    // get by match Date
    @GetMapping("match/date/{date}")
    public List<Match> getMatchByDate(@PathVariable String date) {
        return matchService.getMatchByDate(date);
    }

    // Supprimer tous les matchs déjà passés
    @DeleteMapping("match/date")
    void deleteByDateMatchLessThanCurrentDate(){
        matchService.deleteByDateMatchLessThanCurrentDate() ;

    }

}