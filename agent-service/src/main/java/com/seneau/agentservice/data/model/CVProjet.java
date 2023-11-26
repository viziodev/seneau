package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CVProjet extends AbstractEntity{
    private String role;
    @ManyToOne
    @JoinColumn(name = "projet", referencedColumnName = "id")
    private Projet projet;
    @ManyToOne
    @JoinColumn(name = "cv", referencedColumnName = "id")
    private CV cv;
}
