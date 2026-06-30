package com.meuprojeto.unipds.spring_jpa_aula03.service;

import com.meuprojeto.unipds.spring_jpa_aula03.entity.Categoria;
import com.meuprojeto.unipds.spring_jpa_aula03.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }
}