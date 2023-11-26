package com.seneau.agentservice.service.role;

import com.seneau.agentservice.data.model.Role;
import com.seneau.agentservice.web.controller.dto.*;
import com.seneau.communs.data.dto.role.RoleDto;

import java.util.List;

public interface RoleService {
    RoleResponseDto createRole(RoleRequestDto roleRequestDto);
    ApplicationAccessDto createApplicationAccess(ApplicationAccessRequestDto applicationAccessRequestDto);
    RoleDto getRoleById(Long id);
    List<RoleHierarchiqueDto> getListRoleHierarchiqueByRoleId(Long id);
    List<RoleFonctionnelDto> getListRoleFonctionnelByRoleId(Long id);
    RoleHFDto getListRoleHierarchiqueFonctionnelByRoleId(Long id);
    RoleApplicationAccessDto getRoleApplicationAccessList(Long roleId);
}
