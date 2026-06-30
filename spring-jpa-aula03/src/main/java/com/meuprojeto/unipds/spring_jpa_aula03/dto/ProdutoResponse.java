package com.meuprojeto.unipds.spring_jpa_aula03.dto;

import java.math.BigDecimal;

public class ProdutoResponse {

    private Long id;
    private String nome;
    private BigDecimal preco;
    private String categoria;

    public ProdutoResponse() {
    }

    public ProdutoResponse(Long id, String nome, BigDecimal preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}