package com.seneau.agentservice.config;

import com.seneau.agentservice.activity.AgentActivity;
import com.seneau.communs.config.BaseTemporalConfig;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class TemporalConfig {
        // extends BaseTemporalConfig {
    /*@Bean
    public WorkerFactory workerFactory(WorkflowClient workflowClient, AgentActivity agentActivity) {
        WorkerFactory workerFactory = WorkerFactory.newInstance(workflowClient);
        // create Worker
        Worker worker = workerFactory.newWorker("queue");
        // register activities with worker
         worker.registerActivitiesImplementations(agentActivity);

        workerFactory.start();

        return workerFactory;
    }*/
}
