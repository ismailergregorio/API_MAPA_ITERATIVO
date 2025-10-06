package com.faculdade.unisales.services.servicesCategorias;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.repository.repositoryCategoria;
@Service
public class servicesCategoriaGet {
    @Autowired
    repositoryCategoria repositoryCategoria;

    public ResponseEntity<Categoria> getCategoria(Long id) {
        Optional<Categoria> c = repositoryCategoria.findById(id);

        if(!c.isPresent()){
            return ResponseEntity.badRequest().build();
        }

        Categoria categoria =  c.get(); 
        return ResponseEntity.ok(categoria);
    }
}
