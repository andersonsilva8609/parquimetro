package br.com.fiap.parquimetro.dto;

import br.com.fiap.parquimetro.model.Endereco;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ClienteDTO(

        java.util.UUID id,
        @NotNull(message = "O campo nome precisar ser preenchido")
        String nome,
        LocalDate dataNascimento,

        String email,
        String telefone,

        @NotNull(message = "O status endereço precisar ser preenchido")
        Integer status,
        Endereco endereco,
        TipoFormaPagamento formaPagamentoPreferida

) {
}
