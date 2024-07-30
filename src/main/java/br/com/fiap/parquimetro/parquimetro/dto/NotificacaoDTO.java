package br.com.fiap.parquimetro.dto;

import java.time.LocalDateTime;

public record NotificacaoDTO(

        String id,
        String mensagem,
        String idCliente,
        LocalDateTime dateTime,
        Integer status
) {
}
