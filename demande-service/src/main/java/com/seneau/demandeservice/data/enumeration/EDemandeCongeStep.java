package com.seneau.demandeservice.data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EDemandeCongeStep {
        INIT(0),
        VALIDATION_N_1(1),
        VALIDATION_DIRECTEUR(2),
        VALIDATION_AGENT_PAIE(3),
        CLOSE(4);
        private final long stepCongeIndex;
}
