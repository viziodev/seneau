package com.seneau.communs.data.dto.agent;

import com.seneau.communs.data.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AgentResponseDto {
    private Long id;
    private boolean active = true;
    private Integer matricule;
    private String fullName;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
    private RoleDto role;
}
