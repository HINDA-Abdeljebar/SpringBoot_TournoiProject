package com.football.tournoi.controllers;


import com.football.tournoi.entities.Arbitre;
import com.football.tournoi.repositories.ArbitreRepository;
import com.football.tournoi.services.ArbitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ArbitreController {

    @Autowired
    ArbitreService arbitreService ;


    @GetMapping("arbitre")
    public List<Arbitre> getAllArbitrees() {
        return arbitreService.getAllArbitrees();
    }
    @PostMapping("arbitre")
    public Arbitre addArbitre(@RequestBody Arbitre arbitre){
        return arbitreService.addArbitre(arbitre);
    }

    @DeleteMapping("arbitre/{id}")
    public void deleteArbitre(@PathVariable Long id){arbitreService.deleteArbitre(id);}
    @GetMapping("arbitre/{id}")
    public Arbitre getArbitreById(@PathVariable Long id) {
        return arbitreService.getArbitreById(id);
    }

}