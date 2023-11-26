package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationDto {
    private Long id;
    private String clientId;
    private String applicationName;
    private String description;
}
