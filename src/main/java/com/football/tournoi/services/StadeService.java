package com.football.tournoi.services;


import com.football.tournoi.entities.Match;
import com.football.tournoi.entities.Stade;
import com.football.tournoi.repositories.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StadeService {

    @Autowired
    StadeRepository stadeRepository;
    @Autowired
    MatchService matchService;


    public List<Stade> getAllStadees() {
        return stadeRepository.findAll();
    }

    public Stade addStade(Stade stade){
        return stadeRepository.save(stade);
    }


    public void deleteStade(Long id){
        stadeRepository.deleteById(id);
    }

    public Stade getStadeById(Long id) {
        return stadeRepository.findById(id).get();
    }
    public Stade getStadeByMatchId(Long id){
        Match match = matchService.getMatchById(id);
        Stade stadeDuMatch = match.getStade();
        return stadeDuMatch ;

    }

}