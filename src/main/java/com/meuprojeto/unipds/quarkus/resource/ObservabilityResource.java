package com.meuprojeto.unipds.quarkus.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/observability")
public class ObservabilityResource {

    @GET
    public String monitorar() throws InterruptedException {

        System.out.println("Iniciando processamento...");

        Thread.sleep(1000);

        System.out.println("Finalizando processamento");

        return "Processamento concluído";
    }
}