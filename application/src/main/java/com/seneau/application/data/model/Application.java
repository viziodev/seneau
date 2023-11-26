package com.seneau.application.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String clientId;
    private String applicationName;
    private String description;
    @Column(columnDefinition = "TEXT")
    private String icon;
    @Column(columnDefinition = "boolean default true")
    private boolean active=true;
}
