package com.seneau.agentservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Direction extends AbstractType{
    @ManyToOne
    @JoinColumn(name = "chef", referencedColumnName = "id")
    private Agent chef;
}
