package com.faculdade.unisales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.faculdade.unisales.DTO.dtoCategoria;
import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.services.servicesCategorias.sericesCategoriasGet;
import com.faculdade.unisales.services.servicesCategorias.servicesCategoriaDelete;
import com.faculdade.unisales.services.servicesCategorias.servicesCategoriaGet;
import com.faculdade.unisales.services.servicesCategorias.servicesCategoriasPost;
import com.faculdade.unisales.services.servicesCategorias.servicesCategoriaPut;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/categoria")
public class controllerCategoria {
    @Autowired
    servicesCategoriasPost servicesCategoriasPost;

    @Autowired
    sericesCategoriasGet sericesCategoriaGet;

    @Autowired
    servicesCategoriaGet servicesCategoriaGet;

    @Autowired
    servicesCategoriaPut servicesCategoriaPut;

    @Autowired
    servicesCategoriaDelete servicesCategoriaDelete;

    @PostMapping("/add_categoria")
    public ResponseEntity<dtoCategoria> postCategoria(@RequestBody dtoCategoria entity) {
        // TODO: process POST request
        return servicesCategoriasPost.addCategoria(entity);
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> getCategorias() {
        return ResponseEntity.ok(sericesCategoriaGet.getCategorias());
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity<Categoria> getCategoria(@PathVariable String id) {
        return servicesCategoriaGet.getCategoria(Long.parseLong(id));
    }

    @PutMapping("/categorias/{id}")
    public ResponseEntity<Categoria> AtulisaCategoria(@PathVariable String id, @RequestBody dtoCategoria categoria) {
        // TODO: process PUT request
        return servicesCategoriaPut.atualisarCategoria(Long.parseLong(id), categoria);
    }

    @DeleteMapping("/categorias/{id}")
    public ResponseEntity<Categoria> deletarCategoria(@PathVariable String id) {
        return servicesCategoriaDelete.deletarCategoria(Long.parseLong(id));
    }

}
