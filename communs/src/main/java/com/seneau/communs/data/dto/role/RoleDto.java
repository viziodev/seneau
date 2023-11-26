package com.seneau.communs.data.dto.role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {
    private Long id;
    private String name;
    private RoleDto rolesHierarchique;
}
