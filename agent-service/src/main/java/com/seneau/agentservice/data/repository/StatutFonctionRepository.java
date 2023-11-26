package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Fonction;
import com.seneau.agentservice.data.model.Statut;
import com.seneau.agentservice.data.model.StatutFonction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatutFonctionRepository extends JpaRepository<StatutFonction, Long> {
    StatutFonction findByStatutAndFonctionAndActiveTrue(Statut statut, Fonction fonction);
}
