package com.faculdade.unisales.services.servicesCategorias;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.repository.repositoryCategoria;

@Service
public class servicesCategoriaDelete {
    @Autowired
    repositoryCategoria repositoryCategoria;

    public ResponseEntity<Categoria> deletarCategoria(Long id){
        Optional<Categoria> itenEncontrado = repositoryCategoria.findById(id);

        if(!itenEncontrado.isPresent()){
            return ResponseEntity.badRequest().build();
        }

        Categoria d = itenEncontrado.get();

        repositoryCategoria.delete(d);

        return ResponseEntity.ok(d);
    }
}
