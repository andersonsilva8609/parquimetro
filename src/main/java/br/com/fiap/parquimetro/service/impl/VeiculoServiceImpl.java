package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.VeiculoDTO;
import br.com.fiap.parquimetro.model.Cliente;
import br.com.fiap.parquimetro.model.Veiculo;
import br.com.fiap.parquimetro.model.enums.Status;
import br.com.fiap.parquimetro.model.enums.TipoVeiculo;
import br.com.fiap.parquimetro.repository.VeiculoRepository;
import br.com.fiap.parquimetro.service.VeiculoService;
import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    private VeiculoRepository repo;

    @Override
    public VeiculoDTO criar(VeiculoDTO dto) {

        var veiculo = toEntity(dto);
        veiculo.setStatus(Status.ATIVO);

        return toDTO(repo.save(veiculo));
    }

    @Override
    public VeiculoDTO get(String id) {
        return toDTO(repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Veículo")));
    }

    @Override
    public List<VeiculoDTO> getByClienteId(String id) {
        return null;
    }

    @Override
    public List<VeiculoDTO> getByClenteId(String id) {
        return repo.findByClienteId(id).stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public void update(VeiculoDTO dto) {

        this.get(dto.id());
        repo.save(toEntity(dto));
    }

    public Veiculo toEntity(VeiculoDTO dto){
        Veiculo veiculo;
        veiculo = new Veiculo(
                dto.id(),
                dto.placa(),
                dto.marca(),
                dto.modelo(),
                TipoVeiculo.fromValue(dto.tipo()),
                dto.cor(),
                dto.status() != null ? Status.fromValue(dto.status()) : null,
                new Cliente(idCliente())
        );
        return veiculo;
    }

    private UUID idCliente() {
        return null;
    }

    public VeiculoDTO toDTO(Veiculo veiculo){
        return new VeiculoDTO(
                veiculo.getId(),
                veiculo.getPlaca(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getTipo() != null ? veiculo.getTipo().getValue() : null,
                veiculo.getCor(),
                veiculo.getStatus() != null ? veiculo.getStatus().getValue() : null,
                veiculo.getCliente().getId()
        );
    }

}
