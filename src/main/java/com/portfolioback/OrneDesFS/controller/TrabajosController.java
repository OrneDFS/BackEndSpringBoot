
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.Trabajos;
import com.portfolioback.OrneDesFS.service.ITrabajosService;
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
public class TrabajosController {
    
    @Autowired
    private ITrabajosService instancTrabServ;
    
    @PostMapping("/trabajos/agregar") 
    public void nuevoTrabajo (@RequestBody Trabajos trab){
        instancTrabServ.nuevoTrabajo(trab);
    }
    
    @GetMapping("/trabajos/ver/{id}")
    public Trabajos verTrabajo(@PathVariable int id){
        return instancTrabServ.verTrabajo(id);
    }

    @PutMapping ("/trabajos/editar") 
    public void editarTrabajo(@RequestBody Trabajos trab){
        instancTrabServ.editarTrabajo(trab);
    }
    
    @DeleteMapping ("/trabajos/eliminar/{id}") 
    public void eliminarTrabajo (@PathVariable int id){
        instancTrabServ.eliminarTrabajo(id);
    }
     

  //Lista// 
    @GetMapping ("/trabajos/ver")
    @ResponseBody
        public List <Trabajos> verTrabajos(){ 
        return instancTrabServ.verListaTrabajos();
        }
  

}
