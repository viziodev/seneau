package com.seneau.demandeservice.data.model;

import com.seneau.demandeservice.data.enumeration.ETypeValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class TypeDemande extends AbstractType {
    private Long roleFirstValidation;
    private Long roleLastValidation;
    private ETypeValidation ETypeValidation;
    @OneToMany(mappedBy = "typeDemande")
    private List<NiveauValidation> niveauValidations;
}
