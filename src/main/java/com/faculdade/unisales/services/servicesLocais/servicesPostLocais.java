package com.faculdade.unisales.services.servicesLocais;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.DTO.dtoLocalisacao;
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

 public ResponseEntity<Localisacao> addLocal(dtoLocalisacao local) {
    Optional<Categoria> c = repositoryCategoria.findById(local.getIdcategoria());
    System.out.println("----------------------------"+local.getIdcategoria());
    if(!c.isPresent()){
      return ResponseEntity.badRequest().build();
    }

    Categoria categoriaSelecionada = c.get();

    Localisacao localisacao = new Localisacao();

    localisacao.setNome(local.getNome());
    localisacao.setDescricao(local.getDescricao());
    localisacao.setNumero_telefone(local.getNumero_telefone());
    localisacao.setEmail(local.getEmail());
    localisacao.setURL_imagen(local.getURL_imagen());
    localisacao.setCEP(local.getCEP());
    localisacao.setCidade(local.getCidade());
    localisacao.setEstado(local.getEstado());
    localisacao.setBairro(local.getBairro());
    localisacao.setRua(local.getRua());
    localisacao.setComplemeto(local.getComplemeto());
    localisacao.setNumero(local.getNumero());
    localisacao.setLatitude(local.getLatitude());
    localisacao.setLongitude(local.getLongitude());
    localisacao.setCategoria(categoriaSelecionada);

    repositoryLocal.save(localisacao);

  return ResponseEntity.ok(localisacao);
 }
}
