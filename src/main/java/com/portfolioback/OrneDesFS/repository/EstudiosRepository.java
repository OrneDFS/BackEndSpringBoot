
package com.portfolioback.OrneDesFS.repository;

import com.portfolioback.OrneDesFS.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Integer> {
    public Estudios findById(int id);
}

