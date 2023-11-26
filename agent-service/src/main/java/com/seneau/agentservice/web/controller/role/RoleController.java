package com.seneau.agentservice.web.controller.role;

import com.seneau.agentservice.web.controller.dto.*;
import com.seneau.communs.data.dto.role.RoleDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RoleController {
    @PostMapping("/roles")
    ResponseEntity<RoleResponseDto> createRole(@Valid @RequestBody RoleRequestDto roleRequestDto);
    @GetMapping("/role/{id}")
    ResponseEntity<RoleDto> getRoleById(@PathVariable Long id);
    @GetMapping("/roles/hierarchique/{roleId}")
    ResponseEntity<List<RoleHierarchiqueDto>> getListRoleHierarchique(@PathVariable Long roleId);
     @GetMapping("/roles/hierarchique-fonctionnel/{roleId}")
    ResponseEntity<RoleHFDto> getListRoleHierarchiqueFonctionnel(@PathVariable Long roleId);
    @GetMapping("/roles/fonctionnel/{roleId}")
    ResponseEntity<List<RoleFonctionnelDto>> getListRoleFonctionnel(@PathVariable Long roleId);
    @GetMapping("/roles/application-access/{roleId}")
    ResponseEntity<RoleApplicationAccessDto> getRoleApplicationAccessList(@PathVariable Long roleId);
    @PostMapping("/application-access")
    ResponseEntity<ApplicationAccessDto> createApplicationAccess(@Valid @RequestBody ApplicationAccessRequestDto applicationAccessRequestDto);
}
