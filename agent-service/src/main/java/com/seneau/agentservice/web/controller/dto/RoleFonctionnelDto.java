package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleFonctionnelDto {
    private Long id;
    private String name;
    private String code;
    private RoleHierarchiqueAgentDto rolesFonctionnel;
}
