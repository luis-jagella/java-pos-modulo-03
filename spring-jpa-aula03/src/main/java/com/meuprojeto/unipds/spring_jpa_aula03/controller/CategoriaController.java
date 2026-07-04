package com.meuprojeto.unipds.spring_jpa_aula03.controller;

import com.meuprojeto.unipds.spring_jpa_aula03.entity.Categoria;
import com.meuprojeto.unipds.spring_jpa_aula03.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categoria> listar() {
        return service.listar();
    }

    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria) {
        return service.salvar(categoria);
    }
}