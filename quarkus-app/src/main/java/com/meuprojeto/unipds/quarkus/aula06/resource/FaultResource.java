package com.meuprojeto.unipds.quarkus.aula06.resource;

import com.meuprojeto.unipds.quarkus.aula06.service.ExternalApiService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/fault")
public class FaultResource {

    @Inject
    ExternalApiService service;

    @GET
    public String testar() throws InterruptedException {

        return service.buscarDados();
    }
}