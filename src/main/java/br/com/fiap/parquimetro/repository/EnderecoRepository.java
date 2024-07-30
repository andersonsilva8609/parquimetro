package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
