package com.seneau.demandeservice.service.design.conge;

import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import com.seneau.demandeservice.data.model.Demande;
import com.seneau.demandeservice.data.model.subclass.DemandeConge;
import com.seneau.demandeservice.service.design.DemandeStep;
import com.seneau.demandeservice.web.dto.request.DemandeCongeRequestCreateDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CloseServiceStep extends DemandeStep {
    private final DemandeCongeRequestCreateDto request;
    @Override
    public void processStep(Demande demande) {
        ((DemandeConge) demande).setDateDebutConge(request.getDateDebutConge());
        ((DemandeConge) demande).setMontant(request.getMontant());
        ((DemandeConge) demande).setNbreJourAccorde(request.getNbreJourAccorde());
        ((DemandeConge) demande).setDateFinConge(request.getDateFinConge());
        ((DemandeConge) demande).setCurrentStep(EDemandeCongeStep.CLOSE);
    }
}
