package com.seneau.agentservice.data.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc")
@DiscriminatorValue(value = "AGENT")
@Table(name = "agents")
public class Agent extends AbstractEntity{
    private Integer matricule;
    private String cin;
    private String fullName;
    private String situationMatrimoniale;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
    private Date createdDate = new Date();
    @OneToOne
    private Agent chef;

    @ManyToOne
    @JoinColumn(name = "statut", referencedColumnName = "id")
    private Statut statut;
    @ManyToOne
    @JoinColumn(name = "fonction", referencedColumnName = "id")
    private Fonction fonction;
    @ManyToOne
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    private Secteur secteur; // optional
    @ManyToOne
    @JoinColumn(name = "direction", referencedColumnName = "id")
    private Direction direction;
    @ManyToOne
    @JoinColumn(name = "etablissement", referencedColumnName = "id")
    private Etablissement etablissement;
    @ManyToOne
    @JoinColumn(name = "equipe", referencedColumnName = "id")
    private Equipe equipe;
    @ManyToOne
    @JoinColumn(name = "service", referencedColumnName = "id")
    private Service service; // optional

    @OneToMany(mappedBy = "agent")
    private List<Contrat> contrats = new ArrayList<>();
    @OneToMany(mappedBy = "agent")
    private List<Affectation> affectations = new ArrayList<>();
    @OneToMany(mappedBy = "agent")
    private List<ApplicationAccess> applicationAccesses = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "cv")
    private CV cv;

}

