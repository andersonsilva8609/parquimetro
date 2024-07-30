package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Cliente;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

public interface ClienteRepository extends FlywayProperties.Postgresql<Cliente, String> {
    boolean existsByEmail(String email);
}
