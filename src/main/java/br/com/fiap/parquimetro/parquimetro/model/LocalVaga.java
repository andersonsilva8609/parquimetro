package br.com.fiap.parquimetro.model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
public class LocalVaga extends Endereco{

    private BigDecimal valorHoraVariavel;

    private BigDecimal valorHoraFixa;

    private Status status;

    public LocalVaga(String id){
        this.id = id;
    }
}
