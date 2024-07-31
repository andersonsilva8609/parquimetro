package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table
public class LocalVaga extends Endereco{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String id;

    @Column
    private BigDecimal valorHoraVariavel;

    @Column
    private BigDecimal valorHoraFixa;

    @Column
    private Status status;

    public LocalVaga() {
    }
    public LocalVaga(String id){
    }
}
