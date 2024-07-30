package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Permanencia;
import br.com.fiap.parquimetro.model.enums.PermanenciaStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PermanenciaRepository extends JpaRepository<Permanencia, String> {

    public List<Permanencia> findByCondutorId(String id);

    public List<Permanencia> findByPermanenciaStatus(PermanenciaStatus permanenciaStatus);

    Permanencia save(Permanencia permanencia);

    Optional findById(UUID id);
}
