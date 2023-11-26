package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.ApplicationAccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationAccessRepository extends JpaRepository<ApplicationAccess, Long> {
}
