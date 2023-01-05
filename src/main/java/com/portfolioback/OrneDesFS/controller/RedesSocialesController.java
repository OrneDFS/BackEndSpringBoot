
package com.portfolioback.OrneDesFS.controller;

import com.portfolioback.OrneDesFS.model.RedesSociales;
import com.portfolioback.OrneDesFS.service.IRedesSocialesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RedesSocialesController {
    

    @Autowired
    private IRedesSocialesService instancRSocServ;
    
    @PostMapping("/redes_sociales/agregar") 
    public void nuevaRedSocial (@RequestBody RedesSociales rSoc){
        instancRSocServ.nuevaRedSocial(rSoc);
    }
    
    @GetMapping("/redes_sociales/ver/{id}")
    public RedesSociales verRedSocial(@PathVariable int id){
        return instancRSocServ.verRedSocial(id);
    }
              
    @PutMapping ("/redes_sociales/editar") 
    public void editarRedSocial(@RequestBody RedesSociales rSoc){
        instancRSocServ.editarRedSocial(rSoc);
    }
        
    @DeleteMapping ("/redes_sociales/eliminar/{id}") 
    public void eliminarRedSocial (@PathVariable int id){
        instancRSocServ.eliminarRedSocial(id);
    }
         

  //Lista// 
    @GetMapping ("/redes_sociales/ver")
    @ResponseBody
        public List <RedesSociales> verRedesSociales(){ 
        return instancRSocServ.verListaRedesSociales();
        }
  

}
