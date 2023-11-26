package com.seneau.orchestrator.web.controller;

import com.seneau.orchestrator.web.domain.BaseController;
import com.seneau.orchestrator.workflows.ConnectionWorkflow;
import io.temporal.client.WorkflowClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agents")

public class AfterConnexionController extends BaseController {
    private final ConnectionWorkflow connectionWorkflow;

    public AfterConnexionController(WorkflowClient workflowClient) {
        super();
        this.connectionWorkflow = workflowClient.newWorkflowStub(ConnectionWorkflow.class, options);
    }

    @GetMapping("")
    public ResponseEntity<AgentResponse> getDataAgentAfterConnection(@RequestParam String email, @RequestParam List<String> applicationNames) {
        return ResponseEntity.status(HttpStatus.OK).body(this.connectionWorkflow.getAgentByEmail(email,applicationNames));
    }

}
