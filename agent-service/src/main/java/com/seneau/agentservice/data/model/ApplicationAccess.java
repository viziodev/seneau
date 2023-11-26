package com.seneau.agentservice.data.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class ApplicationAccess extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "application", referencedColumnName = "id")
    private Application application;
    @ManyToOne
    @JoinColumn(name = "agent", referencedColumnName = "id")
    private Agent agent;
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;
}
