package com.faculdade.unisales.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_categoria_dos_locais")
public class Categoria {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(nullable=false, unique = true)
 private String nome;
 @Column(nullable=false, columnDefinition = "TEXT")
 private String descricao;
 public Categoria(){

 };
 public Categoria(Long id, String nome, String descricao) {
  this.id = id;
  this.nome = nome;
  this.descricao = descricao;
 }
 public Long getId() {
  return id;
 }
 public void setIdCategoria(Long id) {
  this.id = id;
 }
 public String getNome() {
  return nome;
 }
 public void setNome(String nome) {
  this.nome = nome;
 }
 public String getDescricao() {
  return descricao;
 }
 public void setDescricao(String descricao) {
  this.descricao = descricao;
 }
}
