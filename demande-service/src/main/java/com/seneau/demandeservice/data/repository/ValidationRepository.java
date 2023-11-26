package com.seneau.demandeservice.data.repository;

import com.seneau.demandeservice.data.model.Validation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationRepository extends JpaRepository<Validation, Long> {
}
