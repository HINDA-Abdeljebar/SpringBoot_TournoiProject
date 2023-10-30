package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @GetMapping("match")
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
    @PostMapping("match")
    public Match addMatch(@RequestBody Match match){
        return matchRepository.save(match);
    }

    @DeleteMapping("match/{id}")
    public void deleteMatch(@PathVariable Long id){
         matchRepository.deleteById(id);
    }
    @GetMapping("match/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchRepository.findById(id).get();
    }

    @GetMapping("match/date/{date}")
    public List<Match> getMatchByDate(@PathVariable Date date) {

        return matchRepository.findByDateMatch(date);
    }
    @DeleteMapping("match/date")
    void deleteByDateMatchLessThanAndHeureMatchLessThan(Date date, Time heure){
//        matchRepository.deleteByDateMatchLessThanAndHeureMatchLessThan();

    }




}