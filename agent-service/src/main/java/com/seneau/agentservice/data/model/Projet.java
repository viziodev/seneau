package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Projet extends AbstractType{
    private String description;
    private Date dateDebut;
    private Date dateFin;
}
