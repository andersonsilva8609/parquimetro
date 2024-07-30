package br.com.fiap.parquimetro.model.enums;

import lombok.Getter;

import java.util.UUID;

@Getter
public enum Status {
    INATIVO(0), ATIVO(1);

    private int value;

    Status(int value){
        this.value = value;
    }

    public static UUID fromValue(int value){
        for (Status status : Status.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Valor numérico inválido: " + value);
    }
}
