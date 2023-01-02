
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.Proyectos;
import com.portfolioback.OrneDesFS.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    
    @Autowired
    private IProyectosService instancProyServ;
            
    
    @PostMapping("/proyectos/agregar") 
    public void nuevoProyecto (@RequestBody Proyectos proye){
        instancProyServ.nuevoProyecto(proye);
    }

    @GetMapping("/proyectos/ver/{id}")
    public Proyectos verProyecto(@PathVariable int id){
        return instancProyServ.verProyecto(id);
    }
    
    @PutMapping ("/proyectos/editar") 
    public void editarProyecto(@RequestBody Proyectos proye){
        instancProyServ.editarProyecto(proye);
    }
    
        
    @DeleteMapping ("/proyectos/eliminar/{id}") 
    public void eliminarProyecto (@PathVariable int id){
        instancProyServ.eliminarProyecto(id);
    }
    
    //Lista// 
    @GetMapping ("/proyectos/ver")
    @ResponseBody
        public List <Proyectos> verProyectos(){ 
        return instancProyServ.verListaProyectos();
        }
    

}
