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
        return null;
    }

    public Object pagamentoStatus() {
        return null;
    }

    public Object tipoPagamento() {
        return null;
    }

    public Object saida() {
        return null;
    }

    public Object entrada() {
        return null;
    }

    public String idLocalVaga() {
        return null;
    }

    public String idVeiculo() {
        return null;
    }

    public Object tempoFixo() {
        return null;
    }

    public Object horasTempoFixo() {
        return null;
    }
}
