
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public void nuevoProyecto(Proyectos proye); 
    public Proyectos verProyecto (int id);
    public void editarProyecto (Proyectos proye);
    public void eliminarProyecto (int id);
    public List<Proyectos> verListaProyectos ();
}
