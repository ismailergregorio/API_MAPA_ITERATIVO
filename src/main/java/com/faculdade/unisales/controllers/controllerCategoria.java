package com.faculdade.unisales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.unisales.DTO.dtoCategoria;
import com.faculdade.unisales.services.servicesCategorias.sericesCategoriaGet;
import com.faculdade.unisales.services.servicesCategorias.servicesCategoriasPost;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/categoria")
public class controllerCategoria {
    @Autowired
    servicesCategoriasPost servicesCategoriasPost;

    @Autowired
    sericesCategoriaGet sericesCategoriaGet;

    @PostMapping("/add_categoria")
    public ResponseEntity<dtoCategoria> postCategoria(@RequestBody dtoCategoria entity) {
        // TODO: process POST request
        servicesCategoriasPost.addCategoria(entity);
        return servicesCategoriasPost.addCategoria(entity);
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<dtoCategoria>> getCategorias() {
        return ResponseEntity.ok(sericesCategoriaGet.getCategorias());
    }
    

}
