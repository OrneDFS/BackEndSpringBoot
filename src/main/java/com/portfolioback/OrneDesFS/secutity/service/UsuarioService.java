
package com.portfolioback.OrneDesFS.secutity.service;

import com.portfolioback.OrneDesFS.secutity.entity.Usuario;
import com.portfolioback.OrneDesFS.secutity.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UsuarioService {
     @Autowired
     IUsuarioRepository iUsuarioRepository;
     
     public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
         return iUsuarioRepository.findByNombreUsuario (nombreUsuario);
     }
     
     public boolean existsByNombreUsuario(String nombreUsuario){
         return iUsuarioRepository.existsByNombreUsuario (nombreUsuario);
     }
     
     public boolean existsByEmail(String email){
         return iUsuarioRepository.existsByEmail (email);
     }     
     
     public void save (Usuario usuario){
         iUsuarioRepository.save(usuario);
     }
}
