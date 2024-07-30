package br.com.fiap.parquimetro.service.impl;

import br.com.fiap.parquimetro.dto.ClienteDTO;
import br.com.fiap.parquimetro.model.Cliente;
import br.com.fiap.parquimetro.model.enums.Status;
import br.com.fiap.parquimetro.repository.ClienteRepository;
import br.com.fiap.parquimetro.repository.EnderecoRepository;
import br.com.fiap.parquimetro.service.ClienteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoServiceImpl enderecoService;

    @Override
    public ClienteDTO criar(ClienteDTO dto) {

        var clienteEndereco = dto.endereco();
        var cliente = toEntity(dto);

        enderecoRepository.save(clienteEndereco);
        return toDTO(repository.save(cliente));
    }

    @Override
    public ClienteDTO get(String id) {
        return toDTO(repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cliente")));
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public void update(ClienteDTO clienteDTO) {
        this.get(ClienteDTO.id());
        var clienteEndereco = clienteDTO.endereco();

        enderecoRepository.save(clienteEndereco);
        repository.save(toEntity(clienteDTO));
    }

    @Override
    public List<ClienteDTO> getClienteList() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Cliente toEntity(ClienteDTO clienteDTO){
        return new Cliente(
                clienteDTO.id(),
                clienteDTO.nome(),
                clienteDTO.dataNascimento(),
                clienteDTO.email(),
                clienteDTO.telefone(),
                clienteDTO.status() != null ?  Status.fromValue(clienteDTO.status()) : null,
                clienteDTO.endereco(),
                clienteDTO.formaPagamentoPreferida()
        );
    }

    public ClienteDTO toDTO(Cliente cliente){
        return new ClienteDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getDataNascimento(),
                cliente.getEmail(),
                cliente.getTelefone(),
                cliente.getStatus() != null ? cliente.getStatus().getValue() : null,
                cliente.getEndereco(),
                cliente.getOpcaoPagamentoPreferida()
        );
    }
}
