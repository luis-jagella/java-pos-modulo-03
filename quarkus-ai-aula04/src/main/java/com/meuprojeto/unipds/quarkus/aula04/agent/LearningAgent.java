package com.meuprojeto.unipds.quarkus.aula04.agent;

import com.meuprojeto.unipds.quarkus.aula04.tools.LearningTools;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(tools = LearningTools.class)
public interface LearningAgent {

    @SystemMessage("""
            Você é um agente de estudos de Java e IA. Use as ferramentas quando elas ajudarem a responder.
            Seja objetivo, não invente dados sobre o andamento do curso e sugira um próximo passo pequeno.
            """)
    String conversar(@MemoryId String sessao, @UserMessage String pergunta);
}
