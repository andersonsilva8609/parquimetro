package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.Status;
import br.com.fiap.parquimetro.model.enums.TipoVeiculo;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    @Id
    private String id;

    private String placa;

    private String marca;

    private String modelo;

    private TipoVeiculo tipo;

    private String cor;

    private Status status;

    private Cliente cliente;

    public Veiculo(String id){
        this.id = id;
    }
}
