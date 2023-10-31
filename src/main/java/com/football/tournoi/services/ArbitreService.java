package com.football.tournoi.services;


import com.football.tournoi.entities.Arbitre;
import com.football.tournoi.repositories.ArbitreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ArbitreService {

    @Autowired
    ArbitreRepository arbitreRepository;


    public List<Arbitre> getAllArbitrees() {
        return arbitreRepository.findAll();
    }

    public Arbitre addArbitre(Arbitre arbitre){
        return arbitreRepository.save(arbitre);
    }


    public void deleteArbitre(Long id){
        arbitreRepository.deleteById(id);
    }

    public Arbitre getArbitreById(Long id) {
        return arbitreRepository.findById(id).get();
    }

}