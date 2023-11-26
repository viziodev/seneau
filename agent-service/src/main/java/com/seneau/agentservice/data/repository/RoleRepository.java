package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
