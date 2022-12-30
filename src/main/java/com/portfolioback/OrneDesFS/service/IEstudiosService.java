
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Estudios;
import java.util.List;


public interface IEstudiosService {
    
    public void nuevoEstudio(Estudios estudio);
    public Estudios verEstudio (int id);
    public void editarEstudio (Estudios estudio);
    public void eliminarEstudio (int id);
    public List<Estudios> verListaEstudios ();
}
