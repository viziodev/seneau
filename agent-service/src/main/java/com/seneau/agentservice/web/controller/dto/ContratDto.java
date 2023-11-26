package com.seneau.agentservice.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContratDto {
    private Long id;
    private boolean active = true;
    private Date dateRetraite;
    private Date dateDebut;
}
