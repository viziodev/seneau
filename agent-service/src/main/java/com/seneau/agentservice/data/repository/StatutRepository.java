package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Statut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatutRepository extends JpaRepository<Statut, Long> {
    Statut findByNameAndActiveTrue(String name);
}
