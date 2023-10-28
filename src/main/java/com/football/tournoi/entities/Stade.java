package com.football.tournoi.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stade {
    @Id
    Long idStade ;
    String nomStade ;
    String ville ;
    @OneToMany(mappedBy = "stade")
    @JsonIgnore
    List<Match> matches ;
}
