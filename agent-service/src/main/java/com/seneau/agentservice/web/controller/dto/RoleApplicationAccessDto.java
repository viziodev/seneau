package com.seneau.agentservice.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleApplicationAccessDto {
    private Long id;
    private String name;
    private String code;
    private RoleHierarchiqueAgentDto rolesHierarchique;
    private RoleHierarchiqueAgentDto rolesFonctionnel;
    private List<ApplicationAccessDto> applicationAccesses;
}
