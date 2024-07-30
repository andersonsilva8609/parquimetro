package br.com.fiap.parquimetro.dto;

import java.math.BigDecimal;
import java.time.Duration;

public record ReciboDTO(
        String id,
        BigDecimal valorHora,
        BigDecimal valorTotal,
        Duration tempoPermanencia,
        java.util.UUID idPermanencia,
        java.util.UUID idCliente
) {
    public Object permanenciaStatus() {
    }

    public Object pagamentoStatus() {
    }

    public Object tipoPagamento() {
    }

    public Object saida() {
    }

    public Object entrada() {
    }

    public String idLocalVaga() {
    }

    public String idVeiculo() {
    }

    public Object tempoFixo() {
    }

    public Object horasTempoFixo() {
    }
}
