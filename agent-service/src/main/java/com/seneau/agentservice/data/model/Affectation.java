package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Affectation extends AbstractEntity {
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "agent", referencedColumnName = "id")
    private Agent agent;
    @ManyToOne
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    private Secteur secteur;
    @ManyToOne
    @JoinColumn(name = "service", referencedColumnName = "id")
    private Service service;
}
