package com.seneau.agentservice.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Role extends AbstractType{
    @OneToMany(mappedBy = "role")
    List<ApplicationAccess> applicationAccesses;
    @JoinColumn(unique = false)
    @OneToOne
    Role rolesHierarchique;
    @JoinColumn(unique = false)
    @OneToOne
    Role rolesFonctionnel;
}
