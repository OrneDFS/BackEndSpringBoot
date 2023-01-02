
package com.portfolioback.OrneDesFS.repository;

import com.portfolioback.OrneDesFS.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesSocialesRepository extends JpaRepository <RedesSociales, Integer> {
    public RedesSociales findById(int id);
}