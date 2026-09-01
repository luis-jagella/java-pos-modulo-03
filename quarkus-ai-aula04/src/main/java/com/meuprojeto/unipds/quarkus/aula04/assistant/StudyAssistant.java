package com.meuprojeto.unipds.quarkus.aula04.assistant;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface StudyAssistant {

    @SystemMessage("""
            Você é um assistente didático para alunos de Java.
            Responda em português do Brasil, de modo objetivo e com exemplos curtos quando fizer sentido.
            Se não souber a resposta, diga isso claramente.
            """)
    @UserMessage("""
            Use o contexto recuperado para responder à pergunta. Caso o contexto não contenha a resposta,
            informe isso claramente e não invente informações.

            Contexto recuperado:
            {{contexto}}

            Pergunta:
            {{pergunta}}
            """)
    String responder(String pergunta, String contexto);
}
