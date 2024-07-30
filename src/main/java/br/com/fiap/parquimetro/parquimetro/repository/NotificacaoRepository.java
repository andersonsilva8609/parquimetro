package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Notificacao;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;

import java.util.List;

public interface NotificacaoRepository extends FlywayProperties.Postgresql<Notificacao, String> {
    public List<Notificacao> findByStatus(Notificacao status);
}
