package com.meuprojeto.unipds.quarkus.aula04.resource;

import com.meuprojeto.unipds.quarkus.aula04.service.KnowledgeIngestionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/conhecimento")
@Produces(MediaType.APPLICATION_JSON)
public class KnowledgeResource {

    @Inject
    KnowledgeIngestionService ingestionService;

    @POST
    @Path("/reindexar")
    public ReindexResponse reindexar() {
        ingestionService.ingerirDocumentosDaAula();
        return new ReindexResponse("Documentos ingeridos no Qdrant com sucesso.");
    }

    public record ReindexResponse(String mensagem) {
    }
}
