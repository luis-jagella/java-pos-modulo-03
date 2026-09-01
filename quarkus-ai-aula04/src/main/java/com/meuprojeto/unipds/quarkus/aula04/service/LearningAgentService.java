package com.meuprojeto.unipds.quarkus.aula04.service;

import com.meuprojeto.unipds.quarkus.aula04.agent.LearningAgent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LearningAgentService {

    @Inject
    LearningAgent agent;

    @Inject
    OutputGuardrailService outputGuardrail;

    public String responder(String sessao, String pergunta) {
        return outputGuardrail.validar(agent.conversar(sessao, pergunta));
    }
}
