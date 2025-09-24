package com.faculdade.unisales.services.servicesCategorias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.DTO.dtoCategoria;
import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.repository.repositoryCategoria;

@Service
public class servicesCategoriasPost {
 @Autowired
 repositoryCategoria repositoryCategoria;

 public ResponseEntity<dtoCategoria> addCategoria(dtoCategoria categoria) {
  try {
   Categoria c = new Categoria();
   c.setNome(categoria.getNome());
   c.setDescricao(categoria.getDescricao());

   repositoryCategoria.save(c);

   dtoCategoria d = new dtoCategoria(c);
   return ResponseEntity.ok(d);

  } catch (org.springframework.dao.DataIntegrityViolationException e) {
   return ResponseEntity.badRequest().body(null);
   // ou pode criar um dto de erro customizado
  }
 }
}
