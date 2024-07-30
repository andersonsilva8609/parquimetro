package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Endereco;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Repository;


@Entity
@Repository
public interface EnderecoRepository extends Jp <Endereco, String> {
}
