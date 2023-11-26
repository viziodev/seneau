package com.seneau.agentservice.web.controller.agent.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgentRequest {
    private Integer matricule;
    private String fullName;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
    private Long chef;
    private Long statut;
    private Long service;
    private Long fonction;
    private Long secteur;
    private Long direction;
    private Long etablissement;
    private Long equipe;
    private List<Long> applications;
    private List<Long> contrats;
}
