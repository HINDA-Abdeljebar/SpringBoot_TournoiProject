package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}