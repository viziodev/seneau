package com.seneau.demandeservice.client;

import com.seneau.communs.data.dto.role.RoleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "AGENT-SERVICE")
public interface RoleRestClient {
    @GetMapping("/api/v1/role/{id}")
    ResponseEntity<RoleDto> getRoleById(@PathVariable Long id);
}
