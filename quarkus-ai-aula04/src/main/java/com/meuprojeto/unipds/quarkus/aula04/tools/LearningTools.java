package com.meuprojeto.unipds.quarkus.aula04.tools;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningTools {

    @Tool("Consulta o andamento registrado do módulo de IA e RAG.")
    public String consultarAndamento() {
        return "Concluídas: AI Service, RAG, Easy RAG, Vector Database e RAG com Qdrant. "
                + "Próximo bloco: agentes, tools, memória, MCP e guardrails.";
    }

    @Tool("Retorna uma sugestão curta de estudo para a próxima sessão.")
    public String sugerirProximoPasso() {
        return "Estude tools e memória por 25 minutos; depois teste uma pergunta que exija consultar o andamento.";
    }
}
