package br.com.fiap.parquimetro.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recibo {

    @Id
    private String id;

    private BigDecimal valorHora;

    private BigDecimal valorTotal;

    private Duration tempoPermanencia;

    private Permanencia permanencia;

    private Cliente cliente;
}
