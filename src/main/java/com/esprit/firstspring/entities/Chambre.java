package com.esprit.firstspring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
        @Getter
        @Setter

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

}
