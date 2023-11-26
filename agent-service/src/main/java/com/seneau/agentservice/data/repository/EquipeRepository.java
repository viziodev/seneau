package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
