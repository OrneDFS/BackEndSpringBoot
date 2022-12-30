
package com.portfolioback.OrneDesFS.repository;

import com.portfolioback.OrneDesFS.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
     public Persona findById(int id);
}

