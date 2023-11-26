package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestataireRepository extends JpaRepository<Prestataire, Long> {
}
