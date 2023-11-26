package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StatutFonction extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "statut", referencedColumnName = "id")
    private Statut statut;
    @ManyToOne
    @JoinColumn(name = "fonction", referencedColumnName = "id")
    private Fonction fonction;
}
