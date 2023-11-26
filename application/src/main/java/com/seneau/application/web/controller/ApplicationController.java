package com.seneau.application.web.controller;

import com.seneau.application.web.dto.ApplicationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ApplicationController {
    @GetMapping
    ResponseEntity<List<ApplicationResponse>> getAllApplication(@RequestParam("applicationClientIds") List<String> applicationClientIds);
}
