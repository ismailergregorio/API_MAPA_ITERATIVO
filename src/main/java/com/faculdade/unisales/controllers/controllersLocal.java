package com.faculdade.unisales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.unisales.DTO.dtoLocalisacao;
import com.faculdade.unisales.models.Localisacao;
import com.faculdade.unisales.services.servicesLocais.servicesDeleteLocais;
import com.faculdade.unisales.services.servicesLocais.servicesGetLocais;
import com.faculdade.unisales.services.servicesLocais.servicesPostLocais;
import com.faculdade.unisales.services.servicesLocais.servicesPutLocais;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/local")
public class controllersLocal {
    @Autowired
    servicesPostLocais localisacao;

    @Autowired
    servicesGetLocais locais;

    @Autowired
    servicesPutLocais servicesPutLocais;

    @Autowired
    servicesDeleteLocais servicesDeleteLocais;

    @PostMapping("add_local")
    public ResponseEntity<Localisacao> postLocais(@RequestBody dtoLocalisacao local) {

        return localisacao.addLocal(local);
    }

    @GetMapping("locais")
    public ResponseEntity<List<Localisacao>> getLocalisacoes() {
        return locais.getLocalisacoes();
    }

    @PutMapping("locais/{id}")
    public ResponseEntity<Localisacao> AtulisacaoLocal(@PathVariable Long id, @RequestBody dtoLocalisacao entity) {
        // TODO: process PUT request

        return servicesPutLocais.atualizarLocal(id, entity);
    }

    @DeleteMapping("locais/{id}")
    public ResponseEntity<Localisacao> DeleteLocal(@PathVariable Long id){
        return servicesDeleteLocais.deleteLocal(id);
    }

}
