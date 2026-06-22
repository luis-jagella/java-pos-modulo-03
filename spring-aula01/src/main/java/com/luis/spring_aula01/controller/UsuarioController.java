package com.luis.spring_aula01.controller;

import com.luis.spring_aula01.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {

        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return ResponseEntity.status(201).body(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorID(@PathVariable Long id) {
        for (Usuario usuario : usuarios) {
            Long idBusca = usuario.getId();
            if (idBusca.equals(id)) {
                return ResponseEntity.ok(usuario);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteByID(@PathVariable Long id) {

        for (Usuario usuario : usuarios) {
            Long idBusca = usuario.getId();
            if (idBusca.equals(id)) {
                usuarios.remove(usuario);
                return ResponseEntity.ok(usuario);
            }
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {

        for (Usuario usuario : usuarios) {

            Long idBusca = usuario.getId();

            if (idBusca.equals(id)) {

                usuario.setNome(
                        usuarioAtualizado.getNome()
                );

                return ResponseEntity.ok(usuario);
            }
        }

        return ResponseEntity.notFound().build();
    }

    //@GetMapping("/total")
}
