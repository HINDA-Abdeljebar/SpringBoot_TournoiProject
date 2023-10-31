package com.football.tournoi.controllers;


import com.football.tournoi.entities.Match;
import com.football.tournoi.entities.Stade;
import com.football.tournoi.services.MatchService;
import com.football.tournoi.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StadeController {

    @Autowired
    StadeService stadeService;
    @Autowired
    MatchService matchService ;

    @GetMapping("stade")
    public List<Stade> getAllStades() {
        return stadeService.getAllStadees();
    }
    @PostMapping("stade")
    public Stade addStade(@RequestBody Stade stade){
        return stadeService.addStade(stade);
    }

    @DeleteMapping("stade/{id}")
    public void deleteStade(@PathVariable Long id){
         stadeService.deleteStade(id);
    }
    @GetMapping("stade/{id}")
    public Stade getStadeById(@PathVariable Long id) {
        return stadeService.getStadeById(id) ;
    }

    // get Stade by Match Id
    @GetMapping("stade/match/{id}")
    public Stade getStadeByMatchId(@PathVariable Long id){
        Match match = matchService.getMatchById(id);
        Stade stadeDuMatch = match.getStade();
        return stadeDuMatch ;

    }
}