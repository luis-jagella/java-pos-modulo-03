package com.meuprojeto.unipds.spring_jpa_aula03.transferencia;

import com.meuprojeto.unipds.spring_jpa_aula03.conta.Conta;
import com.meuprojeto.unipds.spring_jpa_aula03.conta.ContaRepository;
import com.meuprojeto.unipds.spring_jpa_aula03.exception.ContaNaoEncontradaException;
import com.meuprojeto.unipds.spring_jpa_aula03.exception.SaldoInsuficienteException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferenciaService {

    private final ContaRepository contaRepository;

    public TransferenciaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Transactional
    public void transferir(TransferenciaRequest request) {

        Conta origem = contaRepository.findById(request.getContaOrigemId())
                .orElseThrow(() -> new ContaNaoEncontradaException("Conta origem não encontrada."));

        Conta destino = contaRepository.findById(request.getContaDestinoId())
                .orElseThrow(() -> new ContaNaoEncontradaException("Conta destino não encontrada."));

        if (origem.getSaldo().compareTo(request.getValor()) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }

        origem.debitar(request.getValor());

        if (request.isSimularErro()) {
            throw new RuntimeException("Erro simulado após débito.");
        }

        destino.creditar(request.getValor());

        contaRepository.save(origem);
        contaRepository.save(destino);
    }
}