package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.ReciboDTO;
import br.com.fiap.parquimetro.model.Cliente;
import br.com.fiap.parquimetro.model.Permanencia;
import br.com.fiap.parquimetro.model.Recibo;
import br.com.fiap.parquimetro.service.ReciboService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReciboServiceImpl implements ReciboService {

    @Autowired
    private ReciboRepository repo;

    @Override
    public ReciboDTO get(String id) {
        return toDTO(repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Recibo")));
    }

    @Override
    public List<ReciboDTO> getByClienteId(String id) {
        return repo.findByClienteId(id).stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Recibo salva(Recibo recibo){
        return repo.save(recibo);
    }

    public Recibo toEntity(ReciboDTO dto) {
        return new Recibo(
                dto.id(),
                dto.valorHora(),
                dto.valorTotal(),
                dto.tempoPermanencia(),
                new Permanencia(dto.idPermanencia()),
                new Cliente(dto.idCliente())
        );
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
