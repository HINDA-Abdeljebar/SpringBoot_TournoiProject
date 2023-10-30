package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.entities.Stade;
import com.football.tournoi.repositories.MatchRepository;
import com.football.tournoi.repositories.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StadeController {

    @Autowired
    StadeRepository stadeRepository;
    @Autowired
    MatchRepository matchRepository ;

    @GetMapping("stade")
    public List<Stade> getAllStades() {
        return stadeRepository.findAll();
    }
    @PostMapping("stade")
    public Stade addStade(@RequestBody Stade stade){
        return stadeRepository.save(stade);
    }

    @DeleteMapping("stade/{id}")
    public void deleteStade(@PathVariable Long id){
         stadeRepository.deleteById(id);
    }
    @GetMapping("stade/{id}")
    public Stade getStadeById(@PathVariable Long id) {
        return stadeRepository.findById(id).get();
    }

    // get Stade by Match Id
    @GetMapping("stade/match/{id}")
    public Stade getStadeByMatchId(@PathVariable Long id){
        Match match = matchRepository.findById(id).get();
        Stade stadeDuMatch = match.getStade();
        return stadeDuMatch ;

    }
}