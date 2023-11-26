package com.seneau.agentservice.web.controller.dto;

import com.seneau.communs.data.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationAccessDto {
    private Long id;
    private ApplicationDto application;
    private RoleAgentDto role;
}
