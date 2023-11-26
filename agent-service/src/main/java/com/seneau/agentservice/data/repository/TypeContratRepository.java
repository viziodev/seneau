package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeContratRepository extends JpaRepository<TypeContrat, Long> {
    TypeContrat findByNameAndActiveTrue(String name);
}
