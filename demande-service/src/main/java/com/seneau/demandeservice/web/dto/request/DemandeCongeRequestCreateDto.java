package com.seneau.demandeservice.web.dto.request;

import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class DemandeCongeRequestCreateDto extends DemandeRequestDto {
    private Date dateDemandeDebutConge;
    private int  nbreJourDemande;
    private int  nbreJourAccorde;
    private Date dateDebutConge;
    private Date dateFinConge;
    private Integer montant;
    private boolean FraisCongePayed=false;
}
