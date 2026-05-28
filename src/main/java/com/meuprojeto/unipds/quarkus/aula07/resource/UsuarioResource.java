package com.meuprojeto.unipds.quarkus.aula07.resource;

import com.meuprojeto.unipds.quarkus.aula07.entity.Usuario;
import com.meuprojeto.unipds.quarkus.aula07.service.UsuarioService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/usuarios")
public class UsuarioResource {

    @Inject
    UsuarioService service;

    @GET
    public List<Usuario> listar() {

        return service.listar();
    }

    @POST
    public Usuario salvar(Usuario usuario) {

        return service.salvar(usuario);
    }

    @DELETE
    @Path("/{id}")
    public boolean remover(@PathParam("id") Long id) {

        return service.remover(id);
    }
}