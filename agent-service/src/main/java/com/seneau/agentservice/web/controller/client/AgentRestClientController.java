package com.seneau.agentservice.web.controller.client;

import com.seneau.agentservice.web.controller.agent.dto.response.AgentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AgentRestClientController {
    @GetMapping("/{id}")
    ResponseEntity<AgentResponse> getAgentById(@PathVariable Long id);
}
