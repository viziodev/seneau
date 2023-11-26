package com.seneau.communs.data.dto.agent;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AgentRestClientResponse {
    private Integer matricule;
    private String fullName;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
    private Long id;
    private boolean active = true;


}
