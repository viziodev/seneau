package com.seneau.demandeservice.data.model;

import com.seneau.demandeservice.data.enumeration.EStatutValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Validation extends AbstractEntity {
    private Long agent;
    private EStatutValidation statutValidation;
    @ManyToOne
    @JoinColumn(name = "demande", referencedColumnName = "id")
    private Demande demande;
    @ManyToOne
    @JoinColumn(name = "niveauValidation", referencedColumnName = "id")
    private NiveauValidation niveauValidation;
}
