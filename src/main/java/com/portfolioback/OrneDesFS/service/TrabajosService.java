
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Trabajos;
import com.portfolioback.OrneDesFS.repository.TrabajosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajosService implements ITrabajosService{
    
    @Autowired
    private TrabajosRepository instancTrabServ;

    @Override
    public void nuevoTrabajo(Trabajos trab) {
        instancTrabServ.save(trab);  
    }

    @Override
    public Trabajos verTrabajo(int id) {
        return instancTrabServ.findById(id);
    }
    
    @Override
    public void editarTrabajo(Trabajos trab) {
        instancTrabServ.save(trab);
    }

    @Override
    public void eliminarTrabajo(int id) {
        instancTrabServ.deleteById(id);
    }

    @Override
    public List<Trabajos> verListaTrabajos() {
        return instancTrabServ.findAll();
    }
    
}
