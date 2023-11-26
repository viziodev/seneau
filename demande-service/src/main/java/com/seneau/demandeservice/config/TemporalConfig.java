package com.seneau.demandeservice.config;


import com.seneau.communs.config.BaseTemporalConfig;
import com.seneau.demandeservice.activity.DemandeActivity;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemporalConfig extends BaseTemporalConfig {
    @Bean
    public WorkerFactory workerFactory(WorkflowClient workflowClient, DemandeActivity demandeActivity) {
        WorkerFactory workerFactory = WorkerFactory.newInstance(workflowClient);
        // create Worker
        Worker worker = workerFactory.newWorker("queue");
        // register activities with worker
         worker.registerActivitiesImplementations(demandeActivity);

        workerFactory.start();

        return workerFactory;
    }
}