package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.PagamentoStatus;
import br.com.fiap.parquimetro.model.enums.PermanenciaStatus;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permanencia {
    @Id
    private String id;

    private Cliente cliente;

    private Veiculo veiculo;

    private LocalVaga local;

    private LocalDateTime entrada;

    private LocalDateTime saida;

    private TipoFormaPagamento tipoPagamento;

    private PagamentoStatus pagamentoStatus;

    private PermanenciaStatus permanenciaStatus;

    private Boolean tempoFixo;

    private Integer horasTempoFixo;

    public Permanencia(String id){
        this.id = id;
    }
}
