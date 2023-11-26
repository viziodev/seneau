package com.seneau.demandeservice.web.dto.request;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NiveauValidationRequestCreateDto {
    private int ordre;
    private Long role;
}
