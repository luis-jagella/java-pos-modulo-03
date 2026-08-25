package com.meuprojeto.unipds.quarkus.aula04.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChatRequestTest {

    @Test
    void deveManterAPerguntaRecebida() {
        var request = new ChatRequest("O que é Quarkus?");

        assertEquals("O que é Quarkus?", request.pergunta());
    }
}
