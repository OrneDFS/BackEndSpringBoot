
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Habilidades;
import com.portfolioback.OrneDesFS.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    
    
    @Autowired
    private HabilidadesRepository instancHabiServ;

    @Override
    public void nuevaHabilidad(Habilidades habilidad) {
        instancHabiServ.save(habilidad);
    }

    @Override
    public Habilidades verHabilidad(int id) {
        return instancHabiServ.findById(id);
    }
    
    @Override
    public void editarHabilidad(Habilidades habilidad) {
        instancHabiServ.save(habilidad);
    }
    
    @Override
    public void eliminarHabilidad(int id) {
        instancHabiServ.deleteById(id);
    }

    @Override
    public List<Habilidades> verListaHabilidades() {
        return instancHabiServ.findAll();
    }
}
