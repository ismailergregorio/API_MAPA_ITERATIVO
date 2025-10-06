package com.faculdade.unisales.services.servicesCategorias;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.DTO.dtoCategoria;
import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.repository.repositoryCategoria;
@Service

public class servicesCategoriaPut {
    @Autowired
    repositoryCategoria repositoryCategoria;

    public ResponseEntity<Categoria> atualisarCategoria(Long id, dtoCategoria categoria){
        
        Optional<Categoria> categoriaSelecionada = repositoryCategoria.findById(id);

        if(!categoriaSelecionada.isPresent()){
            return ResponseEntity.badRequest().build();
        }

        Categoria itenCategoriaParaAtulisar = categoriaSelecionada.get();

        itenCategoriaParaAtulisar.setNome(categoria.getNome());
        itenCategoriaParaAtulisar.setDescricao(categoria.getDescricao());

        repositoryCategoria.save(itenCategoriaParaAtulisar);

        return ResponseEntity.ok(itenCategoriaParaAtulisar);
    }
}
