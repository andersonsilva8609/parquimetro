package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.LocalVaga;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

public interface LocalVagaRepository extends FlywayProperties.Postgresql<LocalVaga, String> {
}
