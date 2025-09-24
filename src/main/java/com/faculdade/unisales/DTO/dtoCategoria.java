package com.faculdade.unisales.DTO;

import com.faculdade.unisales.models.Categoria;

public class dtoCategoria {
 private String nome;
 private String descricao;
 public dtoCategoria(){

 }
 public dtoCategoria(Categoria c){
  this.nome = c.getNome();
  this.descricao = c.getDescricao();
 }

 public dtoCategoria(String nome, String descricao) {
  this.nome = nome;
  this.descricao = descricao;
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
