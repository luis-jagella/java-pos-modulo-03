package com.meuprojeto.unipds.spring_jpa_aula03.dto;

import java.math.BigDecimal;

public class ProdutoRequest {

    private String nome;
    private BigDecimal preco;
    private Long categoriaId;

    public ProdutoRequest() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }
}