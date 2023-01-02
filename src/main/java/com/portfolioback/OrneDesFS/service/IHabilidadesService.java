
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
   
    public void nuevaHabilidad(Habilidades habi); // habilidad o habi?
    public Habilidades verHabilidad (int id);
    public void editarHabilidad (Habilidades habi);
    public void eliminarHabilidad (int id);
    public List<Habilidades> verListaHabilidades ();
}
