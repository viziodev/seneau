package com.seneau.application.web.controller.implement;

import com.seneau.application.web.controller.ApplicationController;
import com.seneau.application.web.dto.ApplicationRequest;
import com.seneau.application.web.dto.ApplicationResponse;
import com.seneau.application.data.model.Application;
import com.seneau.application.services.ApplicationService;
import com.seneau.application.web.exceptions.BadRequestException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/application")
public class ApplicationControllerImplement implements ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<ApplicationResponse> create(@Valid @RequestBody ApplicationRequest applicationRequest) {
        Application application = applicationService.getApplicationByClientId(applicationRequest.getClientId());
        if (application != null) throw new BadRequestException("{application.exceptions.entityExist}");
        return ResponseEntity.status(HttpStatus.CREATED).body(applicationService.createApplication(applicationRequest));
    }

    @GetMapping
    public ResponseEntity<List<ApplicationResponse>> getAllApplication(@RequestParam("applicationClientIds") List<String> applicationClientIds) {
        return ResponseEntity.ok(applicationService.getAllApplication(applicationClientIds));
    }

}
