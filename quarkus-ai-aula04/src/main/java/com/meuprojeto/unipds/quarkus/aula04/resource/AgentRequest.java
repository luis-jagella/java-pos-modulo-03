package com.meuprojeto.unipds.quarkus.aula04.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AgentRequest(
        @NotBlank @Pattern(regexp = "[a-zA-Z0-9_-]{3,50}") String sessao,
        @NotBlank String pergunta) {
}
