package com.colegioplural.gt.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.colegioplural.gt.models.Responsavel;



@Service
public class ResponsavelService {

    public Responsavel buscarResponsavel(Integer id){
        CrudRepository<Responsavel,Integer> responsavelRepository = null;
        return responsavelRepository.findById(id).get();
    }

    public List<Responsavel> listarResponsavels(){
        ListCrudRepository<Responsavel,Integer> responsavelRepository = null;
        return responsavelRepository.findAll();
    }

    public Boolean deletarResponsavel(Integer id) {
        CrudRepository<Responsavel,Integer> responsavelRepository = null;
        return responsavelRepository.existsById(id);
    }

    public Long contarResponsavels() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Responsavel cadastrarResponsavel(Responsavel responsavel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarResponsavel'");
    }
    
    
}

