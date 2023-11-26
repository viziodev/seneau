package com.seneau.demandeservice.service;

import com.seneau.demandeservice.web.dto.request.DemandeCongeRequestCreateDto;
import com.seneau.demandeservice.web.dto.response.DemandeCongeResponseDto;

public interface DemandeCongeService {
   DemandeCongeResponseDto createDemande(DemandeCongeRequestCreateDto request);
   DemandeCongeResponseDto goToNextStep(Long id,DemandeCongeRequestCreateDto request);
}
