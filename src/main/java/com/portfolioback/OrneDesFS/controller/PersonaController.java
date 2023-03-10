
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.Persona;
import com.portfolioback.OrneDesFS.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService instancPersoServ;
    
        @GetMapping("/persona/ver/{id}")
    public Persona verPersona(@PathVariable int id){
        return instancPersoServ.verPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/agregar") 
    public void nuevaPersona (@RequestBody Persona per){
        instancPersoServ.nuevaPersona(per);
    }   
  
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/persona/editar") 
    public void editarPersona(@RequestBody Persona pers){ 
        instancPersoServ.editarPersona(pers);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/persona/eliminar/{id}") 
    public void eliminarPersona (@PathVariable int id){
        instancPersoServ.eliminarPersona(id);
    }
    
    //Lista de personas//
    @GetMapping ("/persona/ver") 
    @ResponseBody
        public List <Persona> verPersonas(){ 
        return instancPersoServ.verListaPersonas();
        }
}

