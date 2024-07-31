package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Embeddable
@Table
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String id;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String cep;

    public void setStatus(Status status) {
    }

    public Status getStatus() {
        Status status = null;
        return status;
    }
}
