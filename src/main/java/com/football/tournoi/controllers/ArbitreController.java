package com.football.tournoi.controllers;


import com.football.tournoi.entities.Arbitre;
import com.football.tournoi.repositories.ArbitreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ArbitreController {

    @Autowired
    ArbitreRepository arbitreRepository;

    @GetMapping("arbitre")
    public List<Arbitre> getAllArbitrees() {
        return arbitreRepository.findAll();
    }
    @PostMapping("arbitre")
    public Arbitre addArbitre(@RequestBody Arbitre arbitre){
        return arbitreRepository.save(arbitre);
    }

    @DeleteMapping("arbitre/{id}")
    public void deleteArbitre(@PathVariable Long id){
         arbitreRepository.deleteById(id);
    }
    @GetMapping("arbitre/{id}")
    public Arbitre getArbitreById(@PathVariable Long id) {
        return arbitreRepository.findById(id).get();
    }

}