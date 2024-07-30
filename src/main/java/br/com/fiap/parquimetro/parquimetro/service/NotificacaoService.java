package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.NotificacaoDTO;
import br.com.fiap.parquimetro.model.Notificacao;

public interface NotificacaoService {

    public NotificacaoDTO criar(NotificacaoDTO dto);

    public NotificacaoDTO get(String id);

    public void salvarNotificacao(Notificacao notificacao);
}
