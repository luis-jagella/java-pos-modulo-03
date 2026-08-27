package com.meuprojeto.unipds.quarkus.aula04.resource;

import com.meuprojeto.unipds.quarkus.aula04.service.RagService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/chat")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ChatResource {

    @Inject
    RagService ragService;

    @POST
    public ChatResponse conversar(@Valid ChatRequest request) {
        return new ChatResponse(ragService.responder(request.pergunta()));
    }
}
