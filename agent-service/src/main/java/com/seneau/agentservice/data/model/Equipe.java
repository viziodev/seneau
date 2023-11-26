package com.seneau.agentservice.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Equipe extends AbstractType{
    @OneToMany(mappedBy = "equipe")
    private List<Agent> agents = new ArrayList<>();
    @OneToOne
    private Agent chef;
    @ManyToOne
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    private Secteur secteur;
}
