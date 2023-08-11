package com.example.servicio;

import com.example.dao.IindividuoDao;
import com.example.domain.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service

public class IndivudioServicioImp implements IndividuoServicio{

    @Autowired
    private IindividuoDao individuoOao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Individuo> listaIndividuos() {
        return (List<Individuo>) individuoOao.findAll();
         
    }

    @Override
    @Transactional
    public void salvar(Individuo individuo) {
        individuoOao.save(individuo);    
    }

    @Override
    @Transactional
    public void borrar(Individuo individuo) {
        individuoOao.delete(individuo);
    }

    @Override
    @Transactional(readOnly = true)
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoOao.findById(individuo.getId_individuo()).orElse(null);
        
    }
    
    
}
