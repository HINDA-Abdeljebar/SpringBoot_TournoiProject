package com.football.tournoi.services;


import com.football.tournoi.entities.Equipe;
import com.football.tournoi.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    EquipeRepository equipeRepository;


    public List<Equipe> getAllEquipees() {
        return equipeRepository.findAll();
    }

    public Equipe addEquipe(Equipe equipe){
        return equipeRepository.save(equipe);
    }


    public void deleteEquipe(Long id){
        equipeRepository.deleteById(id);
    }

    public Equipe getEquipeById(Long id) {
        return equipeRepository.findById(id).get();
    }
   
    public List<Equipe> getEquipeByPays(String pays) {
        return equipeRepository.findByPays(pays);
    }

    public List<Equipe> getEquipesBymatchId(Long id) {
        return equipeRepository.findByMatchesIdMatch(id);
    }

}