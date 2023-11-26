package com.seneau.demandeservice.data.model.subclass;

import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import com.seneau.demandeservice.data.enumeration.ETypeValidation;
import com.seneau.demandeservice.data.model.Demande;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class DemandeConge  extends Demande {
    private EDemandeCongeStep currentStep;
    //INIT
    private Date dateDemandeDebutConge;
    private int  nbreJourDemande;
    //VALIDATION_AGENT_PAIE
    private int  nbreJourAccorde;
    private Date dateDebutConge;
    private Date dateFinConge;
    private Integer montant;
    private boolean FraisCongePayed=false;

    public DemandeConge() {
        super.getTypeDemande().setETypeValidation(ETypeValidation.FONCTIONNEL);
    }
}
