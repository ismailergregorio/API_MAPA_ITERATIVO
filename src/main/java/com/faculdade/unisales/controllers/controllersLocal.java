package com.faculdade.unisales.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.unisales.models.Localisacao;
import com.faculdade.unisales.services.servicesLocais.servicesGetLocais;
import com.faculdade.unisales.services.servicesLocais.servicesPostLocais;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/local")
public class controllersLocal {
 @PostMapping("add_local")
 public ResponseEntity<Localisacao> postLocais(@RequestBody Localisacao local) {
  servicesPostLocais localisacao = new servicesPostLocais();

  localisacao.addLocal(local);

  return ResponseEntity.ok(local);
 }

 @GetMapping("locais")
 public ResponseEntity<List<Localisacao>> getLocalisacoes() {
  servicesGetLocais locais = new servicesGetLocais();
  return ResponseEntity.ok(locais.getLocalisacoes());
 }

}
