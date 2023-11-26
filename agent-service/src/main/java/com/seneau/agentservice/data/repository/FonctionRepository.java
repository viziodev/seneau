package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FonctionRepository extends JpaRepository<Fonction, Long> {
    Fonction findByNameAndActiveTrue(String name);
}
