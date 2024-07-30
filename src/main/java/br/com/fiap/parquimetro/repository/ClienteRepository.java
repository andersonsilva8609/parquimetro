package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    boolean existsByEmail(String email);

    Optional<Object> findById(UUID id);
}
