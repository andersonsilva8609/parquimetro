package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.NotificacaoDTO;
import br.com.fiap.parquimetro.model.Notificacao;
import br.com.fiap.parquimetro.model.enums.NotificaoStatus;
import br.com.fiap.parquimetro.repository.NotificacaoRepository;
import br.com.fiap.parquimetro.service.NotificacaoService;
import jakarta.persistence.EntityNotFoundException;
import jdk.jshell.Snippet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class NotificacaoServiceImpl implements NotificacaoService {

    @Autowired
    private NotificacaoRepository notificacaoRepository;
    private Snippet clienteDTO;

    public NotificacaoServiceImpl(NotificacaoRepository notificacaoRepository) {
        this.notificacaoRepository = notificacaoRepository;
    }

    private void toEntity(NotificacaoDTO dto) {
    }

    @Override
    public NotificacaoDTO criar(NotificacaoDTO dto) {
        return null;
    }

    @Override
    public NotificacaoDTO get(String id) {
        return toDTO(notificacaoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Notificacao")));
    }

    @Override
    public void salvarNotificacao(Notificacao notificacao) {
        notificacaoRepository.save(notificacao);
    }

    public void processsarNotificacoesNaoLidas(){
        List<Notificacao> notificacoesNaoLidas = notificacaoRepository.findByStatus(NotificaoStatus.NAO_LIDA);

        notificacoesNaoLidas.parallelStream()
                .forEach(this::processarNotificacao);
    }

    private void processarNotificacao(Notificacao notificacao) {
        enviarNotificacao(notificacao);
        notificacao.setStatus(NotificaoStatus.LIDA);
        notificacaoRepository.save(notificacao);
    }

    private void enviarNotificacao(Notificacao notificacao){
        //integração com outros sistemas para envio
        log.info("Mensagem enviada {}", notificacao.toString());
    }

    public NotificacaoDTO toDTO(Notificacao notificacao) {
        return new NotificacaoDTO(
                notificacao.getId(),
                notificacao.getMensagem(),
                notificacao.getCliente().getId(),
                notificacao.getDateTime(),
                notificacao.getStatus().getValue()
        );
    }

}
