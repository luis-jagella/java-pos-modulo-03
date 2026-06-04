package com.luis.spring_aula01.controller;

import com.luis.spring_aula01.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> listar() {

        return usuarios;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {

        usuarios.add(usuario);

        return usuario;
    }

    @GetMapping("/{id}")
    public List<Usuario> buscarPorID() {

        for (Usuario usuario : usuarios) {
            // faet: implementa método pra listar por ID
        }
    }
}
