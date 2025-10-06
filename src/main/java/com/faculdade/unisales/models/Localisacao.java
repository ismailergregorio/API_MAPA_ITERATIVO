package com.faculdade.unisales.models;

import com.faculdade.unisales.DTO.dtoLocalisacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LocaisDoMapa")
public class Localisacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idLocal;
  @Column(nullable = false, unique = true)
  private String nome;
  @Column(nullable = false, columnDefinition = "TEXT")
  private String descricao;
  @Column(nullable = false)
  private String numero_telefone;
  private String email;
  @Column(nullable = false)
  private String URL_imagen;
  @Column(nullable = false)
  private String CEP;
  private String cidade;
  private String estado;
  private String bairro;
  private String rua;
  private String complemeto;
  private int numero;
  @Column(nullable = false)
  private String latitude;
  @Column(nullable = false)
  private String longitude;

  @ManyToOne
  @JoinColumn(name = "id_categoria", nullable = false) // FK para Categoria
  private Categoria categoria;

  public Localisacao() {

  };

  public Localisacao(Long id_local, String nome, String descricao, String numero_telefone, String email,
      String uRL_imagen,
      String cEP, String cidade, String estado, String bairro, String rua, String complemeto, int numero,
      String latitude,
      String longitude, Categoria categoria) {

    this.idLocal = id_local;
    this.nome = nome;
    this.descricao = descricao;
    this.numero_telefone = numero_telefone;
    this.email = email;
    URL_imagen = uRL_imagen;
    CEP = cEP;
    this.cidade = cidade;
    this.estado = estado;
    this.bairro = bairro;
    this.rua = rua;
    this.complemeto = complemeto;
    this.numero = numero;
    this.latitude = latitude;
    this.longitude = longitude;
    this.categoria = categoria;
  }

  public Long getId_local() {
    return idLocal;
  }

  public void setId_local(Long id_local) {
    this.idLocal = id_local;
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

  public String getNumero_telefone() {
    return numero_telefone;
  }

  public void setNumero_telefone(String numero_telefone) {
    this.numero_telefone = numero_telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getURL_imagen() {
    return URL_imagen;
  }

  public void setURL_imagen(String uRL_imagen) {
    URL_imagen = uRL_imagen;
  }

  public String getCEP() {
    return CEP;
  }

  public void setCEP(String cEP) {
    CEP = cEP;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemeto() {
    return complemeto;
  }

  public void setComplemeto(String complemeto) {
    this.complemeto = complemeto;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

}
