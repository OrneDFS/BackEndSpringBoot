
package com.portfolioback.OrneDesFS.repository;


import com.portfolioback.OrneDesFS.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ProyectosRepository extends JpaRepository <Proyectos, Integer> {
    public Proyectos findById(int id);
    }


