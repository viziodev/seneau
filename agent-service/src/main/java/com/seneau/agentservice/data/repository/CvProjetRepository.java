package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.CVProjet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvProjetRepository extends JpaRepository<CVProjet, Long> {
}
