package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public interface ReciboRepository  extends JpaRepository<Recibo, String> {

    public List<Recibo> findByCondutorId(String id);

    Optional<Recibo> findById(String id);

    Recibo save(Recibo recibo);

    Arrays findByClienteId(String id);
}
