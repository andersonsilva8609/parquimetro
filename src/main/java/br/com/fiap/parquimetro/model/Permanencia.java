package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.PagamentoStatus;
import br.com.fiap.parquimetro.model.enums.PermanenciaStatus;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PERMANENCIA")
public class Permanencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private LocalVaga local;

    @Column
    private LocalDateTime entrada;

    private LocalDateTime saida;

    private TipoFormaPagamento tipoPagamento;

    private PagamentoStatus pagamentoStatus;

    private PermanenciaStatus permanenciaStatus;

    private Boolean tempoFixo;

    private Integer horasTempoFixo;

    public Permanencia(UUID id, Cliente cliente, Veiculo veiculo, LocalVaga local, Object entrada, Object saida, Object tipoPagamento,
                       Object pagamentoStatus, Object permanenciaStatus, Object tempoFixo, Object horasTempoFixo){

    }

    public void setEntrada(LocalDateTime now) {
    }

    public void setPagamentoStatus(PagamentoStatus naoPago) {
    }

    public void setPermanenciaStatus(PermanenciaStatus emAndamento) {
    }

    public boolean getTempoFixo() {
    return Boolean.parseBoolean(null);
    }

    public LocalDateTime getEntrada() {
        return null;
    }

    public void setSaida(LocalDateTime plusHours) {
    }

    public long getHorasTempoFixo() {

        return 0;
    }

    public Cliente getCliente() {

        return null;
    }
}
