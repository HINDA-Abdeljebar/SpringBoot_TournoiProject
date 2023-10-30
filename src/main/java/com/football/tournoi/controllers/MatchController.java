package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


    // get by match Date
    @GetMapping("match/date/{date}")
    public List<Match> getMatchByDate(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date) ;
        return matchRepository.findByDateMatch(localDate);
    }

    // delete matches already palyed
    @DeleteMapping("match/date")
    void deleteByDateMatchLessThanAndHeureMatchLessThan(){
    matchRepository.deleteByDateMatchLessThanAndHeureMatchLessThan(LocalDate.now() , LocalTime.now());

    }

}