package com.faculdade.unisales.services.servicesLocais;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.models.Categoria;
import com.faculdade.unisales.models.Localisacao;
import com.faculdade.unisales.repository.repositoryCategoria;
import com.faculdade.unisales.repository.repositoryLocal;

@Service
public class servicesPostLocais {
 @Autowired
 repositoryLocal repositoryLocal;

 @Autowired
 repositoryCategoria repositoryCategoria;

 public ResponseEntity<Localisacao> addLocal(Localisacao local) {

  Optional<Localisacao> localEncontrado = repositoryLocal.findByIdLocal(local.getId_local());
  if (localEncontrado.isPresent()) {
   ResponseEntity.badRequest().build();
  }

  Optional<Categoria> categoria =  repositoryCategoria.findById(local.getCategoria().getId());
  if (categoria.isPresent()) {
   ResponseEntity.badRequest().build();
  }
  repositoryLocal.save(local);

  return ResponseEntity.ok(local);
 }
}
