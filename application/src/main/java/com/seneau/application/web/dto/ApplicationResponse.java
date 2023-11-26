package com.seneau.application.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse {
    private Long id;
    private String clientId;
    private String applicationName;
    private String description;
    private String icon;
    private boolean active;
}
