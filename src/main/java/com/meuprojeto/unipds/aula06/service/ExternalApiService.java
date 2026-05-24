package com.meuprojeto.unipds.aula06.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;

@ApplicationScoped
public class ExternalApiService {

    @Retry(maxRetries = 3)
    @Timeout(2000)
    @Fallback(fallbackMethod = "retornoPadrao")
    public String buscarDados() throws InterruptedException {

        System.out.println("Tentando acessar API externa...");

        Thread.sleep(3000);

        throw new RuntimeException("API indisponível");
    }

    public String retornoPadrao() {
        return "Serviço temporariamente indisponível";
    }
}