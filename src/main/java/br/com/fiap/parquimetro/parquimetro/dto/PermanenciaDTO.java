package br.com.fiap.parquimetro.dto;

import br.com.fiap.parquimetro.model.enums.PagamentoStatus;
import br.com.fiap.parquimetro.model.enums.PermanenciaStatus;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;

import java.time.LocalDateTime;

public record PermanenciaDTO(
        String id,
        String idCliente,
        String idVeiculo,
        String idLocalVaga,
        LocalDateTime entrada,
        LocalDateTime saida,
        TipoFormaPagamento tipoPagamento,
        PagamentoStatus pagamentoStatus,
        PermanenciaStatus permanenciaStatus,
        Boolean tempoFixo,
        Integer horasTempoFixo
) {
}
