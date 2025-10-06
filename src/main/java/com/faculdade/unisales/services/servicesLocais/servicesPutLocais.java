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
public class servicesPutLocais {
    @Autowired
    repositoryLocal repositoryLocal;

    @Autowired
    repositoryCategoria repositoryCategoria;

    public ResponseEntity<Localisacao> atualizarLocal(Long id, dtoLocalisacao Atualisacao_local) {
        Optional<Localisacao> l = repositoryLocal.findById(id);

        if (!l.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        Optional<Categoria> c = repositoryCategoria.findById(Atualisacao_local.getIdcategoria());
        if (!c.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        Categoria categoria_atulisada = c.get();
        Localisacao localisacao = l.get();

        localisacao.setNome(Atualisacao_local.getNome());
        localisacao.setDescricao(Atualisacao_local.getDescricao());
        localisacao.setNumero_telefone(Atualisacao_local.getNumero_telefone());
        localisacao.setEmail(Atualisacao_local.getEmail());
        localisacao.setURL_imagen(Atualisacao_local.getURL_imagen());
        localisacao.setCEP(Atualisacao_local.getCEP());
        localisacao.setCidade(Atualisacao_local.getCidade());
        localisacao.setEstado(Atualisacao_local.getEstado());
        localisacao.setBairro(Atualisacao_local.getBairro());
        localisacao.setRua(Atualisacao_local.getRua());
        localisacao.setComplemeto(Atualisacao_local.getComplemeto());
        localisacao.setNumero(Atualisacao_local.getNumero());
        localisacao.setLatitude(Atualisacao_local.getLatitude());
        localisacao.setLongitude(Atualisacao_local.getLongitude());
        localisacao.setCategoria(categoria_atulisada);

        repositoryLocal.save(localisacao);
        return ResponseEntity.ok(localisacao);
    }
}
