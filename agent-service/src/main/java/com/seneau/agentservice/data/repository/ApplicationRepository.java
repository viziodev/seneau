package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByClientIdInAndActiveTrue(List<String> applicationClientIds);
    Optional<Application> findByClientIdAndActiveTrue(String clientId);
}
