package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Veiculo;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

import java.util.List;

public interface VeiculoRepository extends FlywayProperties.Postgresql<Veiculo, String> {
        public List<Veiculo> findByClienteId(String id);
}
