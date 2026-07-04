package com.meuprojeto.unipds.spring_jpa_aula03.controller;

import com.meuprojeto.unipds.spring_jpa_aula03.dto.ProdutoRequest;
import com.meuprojeto.unipds.spring_jpa_aula03.dto.ProdutoResponse;
import com.meuprojeto.unipds.spring_jpa_aula03.entity.Produto;
import com.meuprojeto.unipds.spring_jpa_aula03.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProdutoResponse> listar() {
        return service.listar();
    }

    @PostMapping
    public Produto cadastrar(@RequestBody ProdutoRequest request) {
        return service.salvar(request);
    }
}