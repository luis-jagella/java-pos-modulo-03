package com.meuprojeto.unipds.quarkus.aula04.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OutputGuardrailServiceTest {

    private final OutputGuardrailService guardrail = new OutputGuardrailService();

    @Test
    void deveRemoverPossivelSegredoDaResposta() {
        var resposta = guardrail.validar("api_key=segredo resposta segura");

        assertEquals("[dado sensível removido] resposta segura", resposta);
    }

    @Test
    void deveRejeitarRespostaVazia() {
        assertThrows(IllegalStateException.class, () -> guardrail.validar(" "));
    }
}
