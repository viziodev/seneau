package com.seneau.orchestrator.web.domain;

import io.temporal.client.WorkflowOptions;
import io.temporal.common.RetryOptions;

public class BaseController {

    protected WorkflowOptions options;

    public BaseController() {
        this.options = WorkflowOptions.newBuilder()
                .setWorkflowId("seneau_workflow")
                .setTaskQueue("queue")
                .setRetryOptions(RetryOptions.newBuilder().setMaximumAttempts(1).build())
                .build();
    }
}

