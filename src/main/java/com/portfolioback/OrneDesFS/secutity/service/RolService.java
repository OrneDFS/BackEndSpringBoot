
package com.portfolioback.OrneDesFS.secutity.service;

import com.portfolioback.OrneDesFS.secutity.entity.Rol;
import com.portfolioback.OrneDesFS.secutity.enums.RolNombre;
import com.portfolioback.OrneDesFS.secutity.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
