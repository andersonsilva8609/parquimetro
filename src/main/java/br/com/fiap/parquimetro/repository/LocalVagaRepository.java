package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.LocalVaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalVagaRepository extends JpaRepository<LocalVaga, String> {
}
