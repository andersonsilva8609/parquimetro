package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.ReciboDTO;
import br.com.fiap.parquimetro.model.*;
import br.com.fiap.parquimetro.repository.ReciboRepository;
import br.com.fiap.parquimetro.service.ReciboService;
import jakarta.persistence.EntityNotFoundException;
import jdk.jshell.Snippet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Service
public class ReciboServiceImpl implements ReciboService {

    @Autowired
    private ReciboRepository repo;
    private Snippet clienteDTO;

    @Override
    public ReciboDTO get(String id) {
        return toDTO((Recibo) repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Recibo")));
    }

    @Override
    public List<ReciboDTO> getByClienteId(String id) {
        return (List<ReciboDTO>) repo.findByClienteId(id);
    }

    public Recibo salva(Recibo recibo){
        return repo.save(recibo);
    }

    public Recibo toEntity(ReciboDTO dto) {
        Recibo recibo = new Recibo(
                dto.id(),
                dto.valorHora(),
                dto.valorTotal(),
                dto.tempoPermanencia(),
                new Permanencia(UUID, new Cliente()));
        return recibo;
    }

    public ReciboDTO toDTO(Recibo recibo){
        return new ReciboDTO(
                recibo.getId(),
                recibo.getValorHora(),
                recibo.getValorTotal(),
                recibo.getTempoPermanencia(),
                recibo.getPermanencia().getId(),
                recibo.getCliente().getId()
        );
    }
}
