package com.luis.spring_aula01.controller;

import com.luis.spring_aula01.model.Usuario;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    /// GET
    @GetMapping
    public List<Usuario> listar() {

        return usuarios;
    }

    /// POST
    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {

        usuarios.add(usuario);

        return usuario;
    }

    /// GET By ID
    @GetMapping("/{id}")
    public Usuario buscarPorID(@PathVariable Long id) {

        for (Usuario usuario : usuarios) {

            Long idBusca = usuario.getId();

            if (idBusca.equals(id)) return usuario;
        }

        return null;
    }

    /// DELETE
    @DeleteMapping("/{id}")
    public Usuario deleteByID(@PathVariable Long id) {

        for (Usuario usuario : usuarios) {

            Long idBusca = usuario.getId();

            if (idBusca.equals(id)) {

                usuarios.remove(usuario);

                return usuario;
            }
        }

        return null;
    }
}
