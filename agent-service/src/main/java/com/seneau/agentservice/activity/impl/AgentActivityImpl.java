package com.seneau.agentservice.activity.impl;


import com.seneau.agentservice.activity.AgentActivity;
import com.seneau.agentservice.service.agent.AgentService;
import com.seneau.agentservice.web.controller.agent.dto.response.AgentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AgentActivityImpl implements AgentActivity {
    private final AgentService agentService;
    @Override
    public AgentResponse getAgentByEmail(String email) {
        return null;
    }
}