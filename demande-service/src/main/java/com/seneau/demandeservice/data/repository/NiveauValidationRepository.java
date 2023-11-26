package com.seneau.demandeservice.data.repository;

import com.seneau.demandeservice.data.model.NiveauValidation;
import com.seneau.demandeservice.data.model.TypeDemande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NiveauValidationRepository extends JpaRepository<NiveauValidation, Long> {
    NiveauValidation findByOrdreAndTypeDemande(long ordre, TypeDemande typeDemande);
}
