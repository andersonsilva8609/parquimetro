package br.com.fiap.parquimetro.repository;

import br.com.fiap.parquimetro.model.Notificacao;
import br.com.fiap.parquimetro.model.enums.NotificaoStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificacaoRepository extends JpaRepository<Notificacao, String> {
    List<Notificacao> findByStatus(NotificaoStatus naoLida);
}
