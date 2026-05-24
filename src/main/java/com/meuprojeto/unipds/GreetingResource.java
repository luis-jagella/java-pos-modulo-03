package com.meuprojeto.unipds;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private User usuario = new User(
            1L,
            "Luís Gabriel"
    );

    @GET
    public User buscar() {
        return usuario;
    }

    @PUT
    public User atualizar(User novoUsuario) {

        usuario.nome = novoUsuario.nome;

        return usuario;
    }

    @DELETE
    public String deletar() {

        usuario = null;

        return "Usuário removido";
    }
}