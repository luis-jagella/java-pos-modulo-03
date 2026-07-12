package com.meuprojeto.unipds.spring_jpa_aula03.transferencia;

import java.math.BigDecimal;

public class TransferenciaRequest {

    private Long contaOrigemId;
    private Long contaDestinoId;
    private BigDecimal valor;
    private boolean simularErro;

    public Long getContaOrigemId() {
        return contaOrigemId;
    }

    public void setContaOrigemId(Long contaOrigemId) {
        this.contaOrigemId = contaOrigemId;
    }

    public Long getContaDestinoId() {
        return contaDestinoId;
    }

    public void setContaDestinoId(Long contaDestinoId) {
        this.contaDestinoId = contaDestinoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isSimularErro() {
        return simularErro;
    }

    public void setSimularErro(boolean simularErro) {
        this.simularErro = simularErro;
    }
}