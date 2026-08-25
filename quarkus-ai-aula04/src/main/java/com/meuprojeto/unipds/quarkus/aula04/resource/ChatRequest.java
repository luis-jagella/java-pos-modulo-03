package com.meuprojeto.unipds.quarkus.aula04.resource;

import jakarta.validation.constraints.NotBlank;

public record ChatRequest(@NotBlank(message = "A pergunta é obrigatória") String pergunta) {
}
