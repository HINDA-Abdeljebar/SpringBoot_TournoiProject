package com.football.tournoi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Arbitre {
    @Id
    Long idArbitre ;
    String nom ;
    String nationalite ;
    @OneToMany(mappedBy = "arbitre")
    @JsonIgnore
    List<Match> matches ;

}
