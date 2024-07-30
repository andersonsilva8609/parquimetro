package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.Status;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private Status status;

    @Embedded
    @ManyToOne
    private Endereco endereco;

    private TipoFormaPagamento opcaoPagamentoPreferida;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(UUID id, @NotNull String nome, LocalDate localDate, String email, String telefone, UUID s, Endereco endereco, TipoFormaPagamento tipoFormaPagamento) {
    }

}
