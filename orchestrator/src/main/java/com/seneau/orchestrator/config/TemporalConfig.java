package com.seneau.orchestrator.config;


import com.seneau.communs.config.BaseTemporalConfig;

import com.seneau.orchestrator.workflows.implementation.ConnectionWorkflowImpl;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemporalConfig extends BaseTemporalConfig {

    @Bean
    public WorkerFactory workerFactory(WorkflowClient workflowClient) {
        WorkerFactory workerFactory = WorkerFactory.newInstance(workflowClient);
        // create Worker
        Worker worker = workerFactory.newWorker("queue");
        // register workflow with worker
        worker.registerWorkflowImplementationTypes(ConnectionWorkflowImpl.class);
        workerFactory.start();
        return workerFactory;
    }
}


