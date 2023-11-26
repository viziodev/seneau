package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
    Etablissement findByNameAndActiveTrue(String name);
}
