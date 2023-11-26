package com.seneau.demandeservice.web.dto.response;

import com.seneau.communs.data.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NiveauValidationResponseDto {
    private int ordre;
    private RoleDto role;
}
