package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterDto {
    private Integer page = 0;
    private Integer pageSize = 5;
    private String sort = "createdDate";
    private String direction;
    private String etablissement;
    private String nom;
    private Integer matricule;
    private Boolean active = true;
}
