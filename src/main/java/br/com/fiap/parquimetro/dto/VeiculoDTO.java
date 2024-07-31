package br.com.fiap.parquimetro.dto;

public record VeiculoDTO(
        String id,
        String placa,
        String marca,
        String modelo,
        Integer tipo,
        String cor,
        Integer status,
        java.util.UUID idCliente
) {
}
