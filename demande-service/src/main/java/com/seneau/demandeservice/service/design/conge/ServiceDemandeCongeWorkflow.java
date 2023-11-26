package com.seneau.demandeservice.service.design.conge;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.demandeservice.data.enumeration.EDemandeCongeStep;
import com.seneau.demandeservice.data.enumeration.EStatutValidation;
import com.seneau.demandeservice.data.model.subclass.DemandeConge;
import com.seneau.demandeservice.service.design.DemandeStep;
import com.seneau.demandeservice.web.dto.request.DemandeCongeRequestCreateDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter

public class ServiceDemandeCongeWorkflow {
    private final DemandeConge  demandeConge;
    private DemandeStep currentStep;

    public ServiceDemandeCongeWorkflow(DemandeConge demandeConge) {
        this.demandeConge = demandeConge;
    }

    public void advanceToNextStep(DemandeCongeRequestCreateDto request, EDemandeCongeStep nextStep) {
        ObjectMapper objectMapper = new ObjectMapper();
        switch (nextStep) {
            case INIT ->  currentStep=new InitServiceStep(request);
            case VALIDATION_N_1 -> {
                changeDemandeCurrentState(request, EDemandeCongeStep.VALIDATION_N_1);
            }
            case VALIDATION_DIRECTEUR-> {
                changeDemandeCurrentState(request, EDemandeCongeStep.VALIDATION_DIRECTEUR);
            }
            case VALIDATION_AGENT_PAIE -> {
                demandeConge.setNbreJourDemande(request.getNbreJourDemande());
                changeDemandeCurrentState(request, EDemandeCongeStep.VALIDATION_AGENT_PAIE);
            }
            case CLOSE-> {currentStep=new CloseServiceStep(request);}
        }
    }
    public void processCurrentStep() {
        currentStep.processStep(demandeConge);
        System.out.println("" + demandeConge.getCurrentStep());
    }

    private void changeDemandeCurrentState(DemandeCongeRequestCreateDto request, EDemandeCongeStep demandeCongeStep) {
        demandeConge.setStatutValidation(request.getStatutValidation());
        if (demandeConge.getStatutValidation() == EStatutValidation.REJECTED) {
            demandeConge.setCurrentStep(EDemandeCongeStep.CLOSE);
        } else {
            demandeConge.setCurrentStep(demandeCongeStep);
        }
    }

}
