package com.seneau.agentservice.web.controller.role.impl;

import com.seneau.agentservice.service.role.RoleService;
import com.seneau.agentservice.web.controller.role.RoleController;
import com.seneau.agentservice.web.controller.dto.*;
import com.seneau.communs.data.dto.role.RoleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoleControllerImpl implements RoleController {
    private final RoleService roleService;

    @Override
    public ResponseEntity<RoleResponseDto> createRole(RoleRequestDto roleRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.createRole(roleRequestDto));
    }

    @Override
    public ResponseEntity<RoleDto> getRoleById(Long id) {
        return ResponseEntity.ok(roleService.getRoleById(id));
    }

    @Override
    public ResponseEntity<List<RoleHierarchiqueDto>> getListRoleHierarchique(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleHierarchiqueByRoleId(roleId));
    }

    @Override
    public ResponseEntity<RoleHFDto> getListRoleHierarchiqueFonctionnel(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleHierarchiqueFonctionnelByRoleId(roleId));
    }

    @Override
    public ResponseEntity<List<RoleFonctionnelDto>> getListRoleFonctionnel(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleFonctionnelByRoleId(roleId));
    }

    @Override
    public ResponseEntity<RoleApplicationAccessDto> getRoleApplicationAccessList(Long roleId) {
        return ResponseEntity.ok(roleService.getRoleApplicationAccessList(roleId));
    }

    @Override
    public ResponseEntity<ApplicationAccessDto> createApplicationAccess(ApplicationAccessRequestDto applicationAccessRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.createApplicationAccess(applicationAccessRequestDto));
    }
}
