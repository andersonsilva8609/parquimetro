package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Recibo;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

import java.util.List;

public interface ReciboRepository  extends FlywayProperties.Postgresql<Recibo, String> {

    public List<Recibo> findByCondutorId(String id);

}
