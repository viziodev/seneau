package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CV extends AbstractType{
    private String formations; // a stocker en json
    @OneToOne
    @JoinColumn(name = "agent")
    private Agent agent;
    @OneToMany(mappedBy = "cv")
    private List<CVProjet> cvProjets;
}
