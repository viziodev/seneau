package com.seneau.agentservice.data.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "CONTRACTUEL")
public class Contractuel extends Agent{
    private int nombreJourCongeAnnuel;
}
