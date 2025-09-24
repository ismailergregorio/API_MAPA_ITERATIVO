package com.faculdade.unisales.services.servicesCategorias;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.DTO.dtoCategoria;
import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.repository.repositoryCategoria;

@Service
public class sericesCategoriaGet {
 @Autowired
 repositoryCategoria repositoryCategoria;

 public List<dtoCategoria> getCategorias(){
  List<Categoria> categoriasEncontrada = new ArrayList<>();
  categoriasEncontrada = repositoryCategoria.findAll();
  return categoriasEncontrada.stream().map(dtoCategoria::new).toList();
 }

}
