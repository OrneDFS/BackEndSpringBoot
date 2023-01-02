
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Trabajos;
import java.util.List;

public interface ITrabajosService {
    
    public void nuevoTrabajo(Trabajos trab); 
    public Trabajos verTrabajo (int id);
    public void editarTrabajo (Trabajos trab);
    public void eliminarTrabajo (int id);
    public List<Trabajos> verListaTrabajos ();
}
