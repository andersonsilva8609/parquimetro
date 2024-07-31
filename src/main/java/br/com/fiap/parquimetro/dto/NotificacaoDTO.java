package br.com.fiap.parquimetro.dto;

import java.time.LocalDateTime;

public record NotificacaoDTO(

        String id,
        String mensagem,
        java.util.UUID idCliente,
        LocalDateTime dateTime,
        Integer status
) {
}
