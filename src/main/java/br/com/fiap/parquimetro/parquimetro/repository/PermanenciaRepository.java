package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Permanencia;
import br.com.fiap.parquimetro.model.enums.PermanenciaStatus;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

import java.util.List;

public interface PermanenciaRepository extends FlywayProperties.Postgresql<Permanencia, String> {

    public List<Permanencia> findByCondutorId(String id);

    public List<Permanencia> findByPermanenciaStatus(PermanenciaStatus permanenciaStatus);
}
