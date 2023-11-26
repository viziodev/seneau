package com.seneau.application.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {
    private Long id;
    @NotBlank(message = "{application.clientId.required}")
    private String clientId;
    @NotBlank(message = "{application.applicationName.required}")
    private String applicationName;
    @NotBlank(message = "{application.description.required}")
    private String description;
    @NotBlank(message = "{application.icon.required}")
    private String icon;
    private boolean active;
}
