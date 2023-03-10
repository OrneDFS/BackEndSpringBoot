
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.Estudios;
import com.portfolioback.OrneDesFS.service.IEstudiosService;
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
public class EstudiosController {
    
    @Autowired
    private IEstudiosService instancEstuServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/estudios/agregar") // modificar agregar postman y personaService!!!
    public void nuevoEstudio (@RequestBody Estudios est){
        instancEstuServ.nuevoEstudio(est);
    }
    
    @GetMapping("/estudios/ver/{id}")
    public Estudios verEstudio(@PathVariable int id){
        return instancEstuServ.verEstudio(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/estudios/editar") 
    public void editarEstudio(@RequestBody Estudios est){
        instancEstuServ.editarEstudio(est);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/estudios/eliminar/{id}") 
    public void eliminarEstudio (@PathVariable int id){
        instancEstuServ.eliminarEstudio(id);
    }

    
        //Lista//
    @GetMapping ("/estudios/ver")
    @ResponseBody
        public List <Estudios> verEstudios(){ //Ver Estudios o Estudio?
        return instancEstuServ.verListaEstudios();
        }
}
