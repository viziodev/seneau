package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Etablissement extends AbstractType{
    @OneToMany(mappedBy = "etablissement")
    private List<Secteur> secteurs = new ArrayList<>();
    @OneToMany(mappedBy = "etablissement")
    private List<Service> services = new ArrayList<>();
    @OneToMany(mappedBy = "etablissement")
    private List<Agent> agents;
}
