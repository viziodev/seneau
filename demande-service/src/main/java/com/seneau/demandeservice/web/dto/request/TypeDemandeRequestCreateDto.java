package com.seneau.demandeservice.web.dto.request;

import com.seneau.demandeservice.data.model.AbstractType;
import com.seneau.demandeservice.web.dto.request.NiveauValidationRequestCreateDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class TypeDemandeRequestCreateDto extends AbstractType {
    private Long roleFirstValidation;
    private Long roleLastValidation;
    private Long typeValidation;
    private List<NiveauValidationRequestCreateDto> niveauValidations;
}
