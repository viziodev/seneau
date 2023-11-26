package com.seneau.demandeservice.service.design.conge;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import com.seneau.demandeservice.data.model.Demande;
import com.seneau.demandeservice.data.model.subclass.DemandeConge;
import com.seneau.demandeservice.service.design.DemandeStep;
import com.seneau.demandeservice.web.dto.request.DemandeCongeRequestCreateDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InitServiceStep extends DemandeStep {
    private final DemandeCongeRequestCreateDto request;
    @Override
    public void processStep(Demande demande) {
        ObjectMapper objectMapper = new ObjectMapper();
        demande= objectMapper.convertValue(request,DemandeConge.class);
        ((DemandeConge)demande).setCurrentStep(EDemandeCongeStep.INIT);
    }
}
