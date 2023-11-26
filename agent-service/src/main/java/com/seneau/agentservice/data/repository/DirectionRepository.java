package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
    Direction findByNameAndActiveTrue(String name);
}
