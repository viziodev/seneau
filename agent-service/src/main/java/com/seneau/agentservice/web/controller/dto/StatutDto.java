package com.seneau.agentservice.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatutDto {
    private Long id;
    private boolean active = true;
    private String name;
    private String code;
}
