
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.Habilidades;
import com.portfolioback.OrneDesFS.service.IHabilidadesService;
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
public class HabilidadesController {
    
    @Autowired
    private IHabilidadesService instancHabiServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/habilidades/agregar") // modificar agregar postman y personaService!!!
    public void nuevaHabilidad (@RequestBody Habilidades habi){
        instancHabiServ.nuevaHabilidad(habi);
    }
    
    @GetMapping("/habilidades/ver/{id}")
    public Habilidades verHabilidad(@PathVariable int id){
        return instancHabiServ.verHabilidad(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/habilidades/editar") 
    public void editarHabilidad(@RequestBody Habilidades habi){
        instancHabiServ.editarHabilidad(habi);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/habilidades/eliminar/{id}") 
    public void eliminarHabilidad (@PathVariable int id){
        instancHabiServ.eliminarHabilidad(id);
    }
    
    //Lista// 
    @GetMapping ("/habilidades/ver")
    @ResponseBody
        public List <Habilidades> verHabilidades(){ 
        return instancHabiServ.verListaHabilidades();
        }
    
}
