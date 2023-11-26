package com.seneau.demandeservice.web.dto.request;

import com.seneau.demandeservice.data.enumeration.EStatutValidation;
import com.seneau.demandeservice.data.model.TypeDemande;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DemandeRequestDto {
    private Long agent;
    private EStatutValidation statutValidation;
    private Date dateDemande;
    private TypeDemande typeDemande;
    private NiveauValidationRequestCreateDto niveauValidation;
}
