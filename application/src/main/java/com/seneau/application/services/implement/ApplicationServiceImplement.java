package com.seneau.application.services.implement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.application.web.dto.ApplicationRequest;
import com.seneau.application.web.dto.ApplicationResponse;
import com.seneau.application.data.model.Application;
import com.seneau.application.data.repository.ApplicationRepository;
import com.seneau.application.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImplement implements ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ObjectMapper objectMapper;
    @Override
    public ApplicationResponse createApplication(ApplicationRequest applicationRequest) {
        // TODO: call keycloak api create clientId
        Application application = objectMapper.convertValue(applicationRequest, Application.class);
        return objectMapper.convertValue(applicationRepository.save(application), ApplicationResponse.class);
    }

    @Override
    public List<ApplicationResponse> getAllApplication(List<String> applicationClientIds) {
        List<Application> applications = applicationRepository.findByClientIdInAndActiveTrue(applicationClientIds);
        return applications
                .stream()
                .map(application -> objectMapper.convertValue(application, ApplicationResponse.class)).toList();
    }

    @Override
    public Application getApplicationByClientId(String clientId) {
        return applicationRepository.findByClientIdAndActiveTrue(clientId).orElse(null);
    }
}
