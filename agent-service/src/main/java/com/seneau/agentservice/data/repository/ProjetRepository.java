package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
