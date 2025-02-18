package com.esprit.firstspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
        @Getter
        @Setter

public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;


    @ManyToOne
    private Bloc bloc;

    @ManyToMany
    private List<Etudiant> etudiants;

}
