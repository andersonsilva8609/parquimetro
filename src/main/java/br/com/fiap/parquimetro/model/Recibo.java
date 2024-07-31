package br.com.fiap.parquimetro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column
    private BigDecimal valorHora;
    
    @Column
    private BigDecimal valorTotal;
    
    @Column
    private Duration tempoPermanencia;
    
    
    @ManyToOne
    @JoinColumn(name = "permanencia_id")
    private Permanencia permanencia;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Recibo(Object id, BigDecimal valorHora, BigDecimal valorTotal, Duration tempoPermanencia, Permanencia permanencia, Cliente cliente) {
    }

    public Permanencia getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(Permanencia permanencia) {
        this.permanencia = permanencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return null;
    }

    public BigDecimal getValorHora() {
        return null;
    }

    public BigDecimal getValorTotal() {
        return null;
    }

    public Duration getTempoPermanencia() {
        return null;
    }
}
