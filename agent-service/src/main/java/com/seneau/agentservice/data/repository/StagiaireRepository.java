package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagiaireRepository extends JpaRepository<Stagiaire, Long> {
}
