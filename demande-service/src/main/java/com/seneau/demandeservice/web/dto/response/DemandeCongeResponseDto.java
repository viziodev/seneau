package com.seneau.demandeservice.web.dto.response;

import com.seneau.demandeservice.web.dto.request.DemandeRequestDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DemandeCongeResponseDto extends DemandeRequestDto {
    private int  nbreJour;
    private Date dateDebutConge;
    private Date dateFinConge;
    List<ValidationResponseDto> validations;

}
