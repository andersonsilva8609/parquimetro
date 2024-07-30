package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.Status;
import br.com.fiap.parquimetro.model.enums.TipoFormaPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private String id;

    private String nome;

    private LocalDate dataNascimento;

    private String email;

    private String telefone;

    private Status status;

    private Endereco endereco;

    private TipoFormaPagamento opcaoPagamentoPreferida;

    public Cliente(String id){
        this.id = id;
    }

}
