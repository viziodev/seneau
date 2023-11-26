package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurRepository extends JpaRepository<Secteur, Long> {
    Secteur findByNameAndActiveTrue(String name);
}
