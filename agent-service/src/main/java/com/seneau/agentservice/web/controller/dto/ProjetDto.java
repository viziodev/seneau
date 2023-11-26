package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProjetDto {
    private String description;
    private Date dateDebut;
    private Date dateFin;
    // TODO: add list agent {id: Long, role: Role} -> parcourir list agent and update projet agents
}
