package com.football.tournoi.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipe {
    @Id
    Long idEquipe ;
    String nomEquipe ;
    String pays ;
    @OneToMany(mappedBy = "equipe" )
    @JsonIgnore
    List<Joueur> joueurs ;
    @ManyToMany(mappedBy = "equipes")
    @JsonIgnore
    List<Match> matches ;
}
