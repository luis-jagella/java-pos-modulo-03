package com.meuprojeto.unipds.quarkus.aula07.service;

import com.meuprojeto.unipds.quarkus.aula07.entity.Usuario;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class UsuarioService {

    public List<Usuario> listar() {
        return Usuario.listAll();
    }

    @Transactional
    public Usuario salvar(Usuario usuario) {

        usuario.persist();

        return usuario;
    }

    @Transactional
    public boolean remover(Long id) {

        return Usuario.deleteById(id);
    }
}