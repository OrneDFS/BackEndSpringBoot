
package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.RedesSociales;
import java.util.List;

public interface IRedesSocialesService {
    
    public void nuevaRedSocial(RedesSociales rSoc); 
    public RedesSociales verRedSocial (int id);
    public void editarRedSocial (RedesSociales rSoc);
    public void eliminarRedSocial (int id);
    public List<RedesSociales> verListaRedesSociales ();
}
