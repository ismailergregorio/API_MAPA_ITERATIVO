package com.faculdade.unisales.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.unisales.models.Localisacao;



@Repository
public interface repositoryLocal extends JpaRepository<Localisacao,Long> {
 Optional<Localisacao> findByIdLocal(Long idLocal);
 
}