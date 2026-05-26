package com.meuprojeto.unipds.aula08.resource;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/security")
public class SecurityResource {

    @GET
    @Path("/public")
    public String publico() {

        return "Endpoint público";
    }

    @GET
    @Path("/user")
    @RolesAllowed("USER")
    public String usuario() {

        return "Área USER";
    }

    @GET
    @Path("/admin")
    @RolesAllowed("ADMIN")
    public String admin() {

        return "Área ADMIN";
    }
}