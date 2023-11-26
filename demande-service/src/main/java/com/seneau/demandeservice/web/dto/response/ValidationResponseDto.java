package com.seneau.demandeservice.web.dto.response;

import com.seneau.demandeservice.data.enumeration.EStatutValidation;
import com.seneau.demandeservice.data.model.AbstractEntity;
import com.seneau.demandeservice.data.model.NiveauValidation;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ValidationResponseDto extends AbstractEntity {

    private EStatutValidation statutValidation;
    private NiveauValidation niveauValidation;
}
