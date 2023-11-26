package com.seneau.demandeservice.service.design;


import com.seneau.demandeservice.data.model.Demande;
import com.seneau.demandeservice.data.model.subclass.DemandeConge;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public abstract class DemandeStep {
    public abstract void processStep(Demande demandeConge);
}
