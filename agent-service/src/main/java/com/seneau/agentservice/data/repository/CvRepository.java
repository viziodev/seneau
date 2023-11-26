package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.CV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<CV, Long> {
}
