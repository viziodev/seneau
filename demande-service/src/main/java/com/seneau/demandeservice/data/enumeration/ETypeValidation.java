package com.seneau.demandeservice.data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ETypeValidation {
    HIERARCHIQUE (0),
    FONCTIONNEL (1);
    private final long validationIndex;
}
