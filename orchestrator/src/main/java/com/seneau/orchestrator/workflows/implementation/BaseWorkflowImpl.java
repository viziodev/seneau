package com.seneau.orchestrator.workflows.implementation;

import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;

import java.time.Duration;
public class BaseWorkflowImpl {

    protected ActivityOptions options;

    public BaseWorkflowImpl() {
        RetryOptions retryOptions = RetryOptions.newBuilder()
                .setInitialInterval(Duration.ofSeconds(1))
                .setMaximumInterval(Duration.ofSeconds(60))
                .setBackoffCoefficient(1).setMaximumAttempts(1)
                .build();

        this.options = ActivityOptions.newBuilder()
                .setStartToCloseTimeout(Duration.ofSeconds(60))
                .setScheduleToCloseTimeout(Duration.ofSeconds(60))
                .setRetryOptions(retryOptions)
                .build();

    }
}
