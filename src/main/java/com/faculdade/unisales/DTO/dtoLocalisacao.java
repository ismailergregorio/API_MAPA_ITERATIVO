package com.faculdade.unisales.DTO;

public class dtoLocalisacao {

    private String nome;
    private String descricao;
    private String numero_telefone;
    private String email;
    private String URL_imagen;
    private String CEP;
    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String complemeto;
    private int numero;
    private String latitude;
    private String longitude;
    private Long idcategoria;

    public dtoLocalisacao() {

    }

    public dtoLocalisacao(String nome, String descricao, String numero_telefone, String email, String uRL_imagen,
            String cEP, String cidade, String estado, String bairro, String rua, String complemeto, int numero,
            String latitude, String longitude, Long idcategoria) {
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
        this.idcategoria = idcategoria;
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

    public Long getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Long idcategoria) {
        this.idcategoria = idcategoria;
    }
}
