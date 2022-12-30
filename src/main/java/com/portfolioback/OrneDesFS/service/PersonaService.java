
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Persona;
import com.portfolioback.OrneDesFS.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository instancPersoRepo;
    
    
    @Override
    public void nuevaPersona(Persona persona) {
        instancPersoRepo.save(persona);
    }

    @Override
    public Persona verPersona(int id) {
        return instancPersoRepo.findById(id);
    }

    @Override
    public void editarPersona(Persona persona) {
        instancPersoRepo.save(persona);
    }

    @Override
    public void eliminarPersona(int id) {
        instancPersoRepo.deleteById(id);
    }

    @Override
    public List<Persona> verListaPersonas() {
        return instancPersoRepo.findAll();
    }
    
}
