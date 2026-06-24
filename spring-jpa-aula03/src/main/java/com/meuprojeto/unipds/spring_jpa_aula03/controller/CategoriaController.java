package com.meuprojeto.unipds.spring_jpa_aula03.controller;

import com.meuprojeto.unipds.spring_jpa_aula03.entity.Categoria;
import com.meuprojeto.unipds.spring_jpa_aula03.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }
}