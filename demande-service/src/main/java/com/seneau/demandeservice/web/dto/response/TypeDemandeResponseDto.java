package com.seneau.demandeservice.web.dto.response;

import com.seneau.communs.data.dto.role.RoleDto;
import com.seneau.demandeservice.data.model.AbstractType;
import com.seneau.demandeservice.web.dto.response.NiveauValidationResponseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class TypeDemandeResponseDto extends AbstractType {
    private RoleDto roleFirstValidation;
    private RoleDto roleLastValidation;
    private Long typeValidation;
    private List<NiveauValidationResponseDto> niveauValidations;
}
