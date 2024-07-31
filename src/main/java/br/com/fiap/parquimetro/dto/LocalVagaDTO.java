package br.com.fiap.parquimetro.dto;

import br.com.fiap.parquimetro.model.enums.Status;
import org.apache.hc.core5.annotation.Contract;

import java.math.BigDecimal;

public record LocalVagaDTO(
        String id,
        BigDecimal valorHoraVariavel,
        BigDecimal valorHoraFixa,
        Status status,
        String rua,
        String numero,
        String bairro,
        String cidade,
        String estado,
        String pais,
        String cep
) {
}
