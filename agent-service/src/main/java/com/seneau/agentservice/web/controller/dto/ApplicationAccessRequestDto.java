package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationAccessRequestDto {
    private Long role;
    private Long application;
    private Long agent;
}
