package com.portfolioback.OrneDesFS.service;

import com.portfolioback.OrneDesFS.model.RedesSociales;
import com.portfolioback.OrneDesFS.repository.RedesSocialesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesSocialesService implements IRedesSocialesService {
    
    @Autowired
    private RedesSocialesRepository instancRSocServ;

    @Override
    public void nuevaRedSocial(RedesSociales rSoc) {
        instancRSocServ.save(rSoc);    
    }

    @Override
    public RedesSociales verRedSocial(int id) {
        return instancRSocServ.findById(id);
    }

    @Override
    public void editarRedSocial(RedesSociales rSoc) {
        instancRSocServ.save(rSoc);
    }

    @Override
    public void eliminarRedSocial(int id) {
        instancRSocServ.deleteById(id);
    }

    @Override
    public List<RedesSociales> verListaRedesSociales() {
        return instancRSocServ.findAll();
    }

}