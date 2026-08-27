package com.meuprojeto.unipds.quarkus.aula04.service;

import com.meuprojeto.unipds.quarkus.aula04.assistant.StudyAssistant;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RagService {

    private static final int MAX_RESULTADOS = 3;
    private static final double SCORE_MINIMO = 0.60;

    @Inject
    StudyAssistant assistant;

    @Inject
    EmbeddingModel embeddingModel;

    @Inject
    EmbeddingStore<TextSegment> embeddingStore;

    public String responder(String pergunta) {
        var embeddingDaPergunta = embeddingModel.embed(pergunta).content();
        var contexto = embeddingStore.findRelevant(embeddingDaPergunta, MAX_RESULTADOS, SCORE_MINIMO)
                .stream()
                .map(resultado -> resultado.embedded().text())
                .reduce((primeiro, proximo) -> primeiro + "\n\n---\n\n" + proximo)
                .orElse("Nenhum trecho relevante foi encontrado na base de conhecimento.");

        return assistant.responder(pergunta, contexto);
    }
}
