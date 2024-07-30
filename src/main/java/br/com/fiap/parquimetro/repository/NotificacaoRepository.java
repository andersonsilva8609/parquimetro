package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepository extends JpaRepository<Notificacao, String> {
}
