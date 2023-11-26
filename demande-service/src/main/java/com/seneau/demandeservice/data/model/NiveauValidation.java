package com.seneau.demandeservice.data.model;

import com.seneau.demandeservice.data.model.AbstractEntity;
import com.seneau.demandeservice.data.model.TypeDemande;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NiveauValidation extends AbstractEntity {
    private long ordre;
    private Long role;
    @ManyToOne
    @JoinColumn(name = "typeDemande", referencedColumnName = "id")
    private TypeDemande typeDemande;
}
