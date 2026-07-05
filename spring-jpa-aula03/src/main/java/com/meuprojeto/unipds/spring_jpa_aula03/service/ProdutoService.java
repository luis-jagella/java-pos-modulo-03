package com.meuprojeto.unipds.spring_jpa_aula03.service;

import com.meuprojeto.unipds.spring_jpa_aula03.dto.ProdutoRequest;
import com.meuprojeto.unipds.spring_jpa_aula03.dto.ProdutoResponse;
import com.meuprojeto.unipds.spring_jpa_aula03.entity.Categoria;
import com.meuprojeto.unipds.spring_jpa_aula03.entity.Produto;
import com.meuprojeto.unipds.spring_jpa_aula03.repository.CategoriaRepository;
import com.meuprojeto.unipds.spring_jpa_aula03.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProdutoService(
            ProdutoRepository produtoRepository,
            CategoriaRepository categoriaRepository
    ) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public ProdutoResponse salvar(ProdutoRequest request) {

        Categoria categoria = categoriaRepository
                .findById(request.getCategoriaId())
                .orElseThrow(() ->
                        new RuntimeException("Categoria não encontrada.")
                );

        Produto produto = new Produto();

        produto.setNome(request.getNome());
        produto.setPreco(request.getPreco());
        produto.setCategoria(categoria);

        Produto produtoSalvo = produtoRepository.save(produto);

        return new ProdutoResponse(
                produtoSalvo.getId(),
                produtoSalvo.getNome(),
                produtoSalvo.getPreco(),
                produtoSalvo.getCategoria().getNome()
        );
    }

    public List<ProdutoResponse> listar() {

        return produtoRepository.findAll()
                .stream()
                .map(produto -> new ProdutoResponse(
                        produto.getId(),
                        produto.getNome(),
                        produto.getPreco(),
                        produto.getCategoria().getNome()
                ))
                .collect(Collectors.toList());
    }
}