package com.esprit.firstspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
        @Getter
        @Setter
                 @NoArgsConstructor
                @AllArgsConstructor

public class Universite   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;


    @OneToOne
    private Foyer foyer;
}
