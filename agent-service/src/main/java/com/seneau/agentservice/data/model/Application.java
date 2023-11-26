package com.seneau.agentservice.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "applications")
public class Application extends AbstractEntity{
    @Column(unique = true)
    private String clientId;
    private String applicationName;
    private String description;
    @Column(columnDefinition = "TEXT")
    private String icon;
    @Column(columnDefinition = "boolean default true")
    private boolean active=true;
}
