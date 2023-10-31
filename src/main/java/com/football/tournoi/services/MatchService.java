package com.football.tournoi.services;


import com.football.tournoi.entities.Match;
import com.football.tournoi.repositories.MatchRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;


    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match addMatch(Match match){
        return matchRepository.save(match);
    }


    public void deleteMatch(Long id){
        matchRepository.deleteById(id);
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).get();
    }
    public List<Match> getMatchByDate(String date) {
        LocalDate localDate = LocalDate.parse(date) ;
        return matchRepository.findByDateMatch(localDate);
    }

    @Transactional
    public void deleteByDateMatchLessThanCurrentDate(){
        matchRepository.deleteByDateMatchLessThan(LocalDate.now()) ;

    }

}