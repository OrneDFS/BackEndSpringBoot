
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Estudios;
import com.portfolioback.OrneDesFS.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService {
    
    @Autowired
    private EstudiosRepository instancEstuServ;

    @Override
    public void nuevoEstudio(Estudios estudio) { 
        instancEstuServ.save(estudio);
    }

    @Override
    public Estudios verEstudio(int id) {
        return instancEstuServ.findById(id);
    }

    @Override
    public void editarEstudio(Estudios estudio) { 
        instancEstuServ.save(estudio);
    } 

    @Override
    public void eliminarEstudio(int id) {
        instancEstuServ.deleteById(id);
    }

    @Override
    public List<Estudios> verListaEstudios() {
        return instancEstuServ.findAll();
    }

    
}

