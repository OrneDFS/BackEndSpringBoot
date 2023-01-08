
package com.portfolioback.OrneDesFS.secutity.repository;

import com.portfolioback.OrneDesFS.secutity.entity.Rol;
import com.portfolioback.OrneDesFS.secutity.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
