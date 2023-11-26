package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
    @Query("SELECT c FROM Contrat c WHERE c.active=true AND c.typeContrat.name=:name")
    Contrat findByTypeContratNameAndActiveTrue(@Param("name") String name);
}
