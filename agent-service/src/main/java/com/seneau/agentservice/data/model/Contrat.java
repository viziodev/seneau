package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Contrat extends AbstractEntity {
    private Integer matricule;
    private Date dateRetraite;
    private Date dateDebut;
    private Date dateSortie;
    @ManyToOne
    @JoinColumn(name = "statut", referencedColumnName = "id")
    private Statut statut;
    @ManyToOne
    @JoinColumn(name = "agent", referencedColumnName = "id")
    private Agent agent;
    @ManyToOne
    @JoinColumn(name = "typeContrat", referencedColumnName = "id")
    private TypeContrat typeContrat;
}
