package br.com.fiap.parquimetro.model.enums;

import lombok.Getter;

@Getter
public enum TipoVeiculo {

    CARRO(0), MOTO(1), CAMINHAO(2);

    private int value;

    TipoVeiculo(int value){
        this.value = value;
    }

    public static TipoVeiculo fromValue(int value){
        for (TipoVeiculo status : TipoVeiculo.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Valor numérico inválido: " + value);
    }
}
