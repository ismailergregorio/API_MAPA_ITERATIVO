package com.faculdade.unisales.services.servicesLocais;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.models.Localisacao;
import com.faculdade.unisales.repository.repositoryLocal;

@Service
public class servicesDeleteLocais {
    @Autowired
    repositoryLocal repositoryLocal;

    public ResponseEntity<Localisacao> deleteLocal(Long id){
        Optional<Localisacao> l = repositoryLocal.findById(id);

        if(!l.isPresent()){
            return ResponseEntity.badRequest().build();
        }
        
        Localisacao localisacao = l.get();
        
        repositoryLocal.delete(localisacao);

        return ResponseEntity.ok(localisacao);
    }
}
