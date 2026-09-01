package com.meuprojeto.unipds.quarkus.aula04.service;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.regex.Pattern;

@ApplicationScoped
public class OutputGuardrailService {

    private static final Pattern TOKEN_SENSIVEL = Pattern.compile("(?i)(api[_-]?key|token|senha)\\s*[:=]\\s*\\S+");

    public String validar(String resposta) {
        if (resposta == null || resposta.isBlank()) {
            throw new IllegalStateException("O agente não gerou uma resposta utilizável.");
        }

        return TOKEN_SENSIVEL.matcher(resposta).replaceAll("[dado sensível removido]");
    }
}
