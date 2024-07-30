package br.com.fiap.parquimetro.model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table
public class LocalVaga extends Endereco{

    private BigDecimal valorHoraVariavel;

    private BigDecimal valorHoraFixa;

    private Status status;

    public LocalVaga() {
    }

    public LocalVaga(String id){
        this.id = id;
    }

    public String getId() {
    }
}
