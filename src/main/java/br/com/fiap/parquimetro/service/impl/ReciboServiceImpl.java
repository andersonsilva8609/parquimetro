package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.ReciboDTO;
import br.com.fiap.parquimetro.model.*;
import br.com.fiap.parquimetro.repository.ReciboRepository;
import br.com.fiap.parquimetro.service.ReciboService;
import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Getter
@Setter
@Service
public class ReciboServiceImpl implements ReciboService {

    @Autowired
    private ReciboRepository repo;

    @Override
    public ReciboDTO get(String id) {
        return toDTO((Recibo) repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Recibo")));
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
                new Permanencia(dto.idPermanencia(), new Cliente(clienteDTO.id(), clienteDTO.nome(), clienteDTO.dataNascimento(), clienteDTO.email(), clienteDTO.telefone(), dto.idCliente(), clienteDTO.endereco(), clienteDTO.formaPagamentoPreferida()), new Veiculo(dto.idVeiculo()), new LocalVaga(dto.idLocalVaga()), dto.entrada(), dto.saida(), dto.tipoPagamento(), dto.pagamentoStatus(), dto.permanenciaStatus(), dto.tempoFixo(), dto.horasTempoFixo()),
                new Cliente(clienteDTO.id(), clienteDTO.nome(), clienteDTO.dataNascimento(), clienteDTO.email(), clienteDTO.telefone(), dto.idCliente(), clienteDTO.endereco(), clienteDTO.formaPagamentoPreferida())
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
