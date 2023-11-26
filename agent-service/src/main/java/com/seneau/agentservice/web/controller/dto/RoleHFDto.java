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
public class RoleHFDto {
    private List<RoleHierarchiqueDto> roleHierarchiques;
    private List<RoleFonctionnelDto> roleFonctionnels;
}
