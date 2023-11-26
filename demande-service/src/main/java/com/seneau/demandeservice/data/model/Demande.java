package com.seneau.demandeservice.data.model;

import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import com.seneau.demandeservice.data.enumeration.EStatutValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Demande extends AbstractEntity{
    private Long agent;
    private Long agentValidation;
    private EStatutValidation statutValidation;
    private Date dateDemande;
    @ManyToOne
    @JoinColumn(name = "typeDemande", referencedColumnName = "id")
    private TypeDemande typeDemande;
    @OneToMany(mappedBy = "demande")
    private List<Validation> validations;

}
