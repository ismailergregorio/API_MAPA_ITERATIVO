package com.faculdade.unisales.services.servicesLocais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.faculdade.unisales.models.Localisacao;

import com.faculdade.unisales.repository.repositoryLocal;

@Service
public class servicesGetLocais {
    @Autowired
    repositoryLocal repositoryLocal;

    public ResponseEntity<List<Localisacao>> getLocalisacoes() {
        List<Localisacao> localisacoes = repositoryLocal.findAll();

        return ResponseEntity.ok(localisacoes);
    }
}
