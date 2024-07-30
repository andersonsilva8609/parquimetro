package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
        public List<Veiculo> findByClienteId(String id);
}
