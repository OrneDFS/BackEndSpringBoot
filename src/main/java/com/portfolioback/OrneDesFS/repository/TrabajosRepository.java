
package com.portfolioback.OrneDesFS.repository;


import com.portfolioback.OrneDesFS.model.Trabajos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajosRepository extends JpaRepository <Trabajos, Integer> {
    public Trabajos findById(int id);
}
