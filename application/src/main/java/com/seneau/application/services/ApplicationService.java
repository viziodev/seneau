package com.seneau.application.services;

import com.seneau.application.web.dto.ApplicationRequest;
import com.seneau.application.web.dto.ApplicationResponse;
import com.seneau.application.data.model.Application;

import java.util.List;

public interface ApplicationService {
    ApplicationResponse createApplication(ApplicationRequest applicationRequest);
    List<ApplicationResponse> getAllApplication(List<String> applicationClientIds);
    Application getApplicationByClientId(String clientId);
}
