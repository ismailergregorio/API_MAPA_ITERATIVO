package com.faculdade.unisales.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.unisales.models.Categoria;

@Repository
public interface repositoryCategoria extends JpaRepository<Categoria,Long>{
 Optional<Categoria> findById(Long id);
 
}