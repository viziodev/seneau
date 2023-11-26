package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Contractuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractuelRepository extends JpaRepository<Contractuel, Long> {
}
