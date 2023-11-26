package com.seneau.orchestrator.workflows.implementation;


import com.seneau.communs.activity.agent.AgentActivity;
import com.seneau.orchestrator.workflows.ConnectionWorkflow;
import io.temporal.workflow.Workflow;

import java.util.List;


public class ConnectionWorkflowImpl extends BaseWorkflowImpl implements ConnectionWorkflow {
    private final AgentActivity agentActivity;
    ///private final ApplicationActivity applicationActivity;
    public ConnectionWorkflowImpl() {
        super();
        this.agentActivity = Workflow.newActivityStub(AgentActivity.class, options);
       // this.applicationActivity = Workflow.newActivityStub(ApplicationActivity.class, options);
    }

    @Override
    public AgentResponse getAgentByEmail(String email,List<String> applicationNames) {
        //List<ApplicationDto> applicationsByUserConnect = applicationActivity.getApplicationsByUserConnect(applicationNames);
        AgentResponse agentConnect = agentActivity.getAgentByEmail(email);
      //  agentConnect.setApplications(applicationsByUserConnect);
         return agentConnect;
    }


}
