package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    Service findByNameAndActiveTrue(String name);
}
