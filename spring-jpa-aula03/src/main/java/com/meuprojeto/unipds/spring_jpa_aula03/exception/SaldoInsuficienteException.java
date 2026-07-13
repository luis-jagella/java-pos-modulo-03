package com.meuprojeto.unipds.spring_jpa_aula03.exception;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}