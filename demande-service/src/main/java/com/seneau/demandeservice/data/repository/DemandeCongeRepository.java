package com.seneau.demandeservice.data.repository;

import com.seneau.demandeservice.data.model.subclass.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Long> {
}
