package com.meuprojeto.unipds.spring_jpa_aula03.exception;

public class ContaNaoEncontradaException extends RuntimeException {

    public ContaNaoEncontradaException(String message) {
        super(message);
    }
}