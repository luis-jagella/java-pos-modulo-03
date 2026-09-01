package com.meuprojeto.unipds.quarkus.aula04.resource;

import com.meuprojeto.unipds.quarkus.aula04.service.LearningAgentService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/agente")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AgentResource {

    @Inject
    LearningAgentService agentService;

    @POST
    public ChatResponse conversar(@Valid AgentRequest request) {
        return new ChatResponse(agentService.responder(request.sessao(), request.pergunta()));
    }
}
