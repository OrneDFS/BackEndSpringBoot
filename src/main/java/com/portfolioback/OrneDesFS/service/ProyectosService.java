
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Proyectos;
import com.portfolioback.OrneDesFS.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private ProyectosRepository instancProyServ;
            
    @Override
    public void nuevoProyecto(Proyectos proye) {
        instancProyServ.save(proye);
    }

    @Override
    public Proyectos verProyecto(int id) {
        return instancProyServ.findById(id);
    }

    @Override
    public void editarProyecto(Proyectos proye) {
        instancProyServ.save(proye);
    }

    @Override
    public void eliminarProyecto(int id) {
        instancProyServ.deleteById(id);
    }

    @Override
    public List<Proyectos> verListaProyectos() {
        return instancProyServ.findAll();
    }
    
}
