package com.seneau.demandeservice.client;


import com.seneau.communs.data.dto.agent.AgentResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "AGENT-SERVICE")
public interface AgentRestClient {
 @GetMapping("/api/v1/agent/chef/{id}")
 ResponseEntity<AgentResponseDto> getChefByAgentId(@PathVariable Long id);
}
