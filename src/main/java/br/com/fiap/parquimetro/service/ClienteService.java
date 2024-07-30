package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.ClienteDTO;
import java.util.List;
import java.util.UUID;

public interface ClienteService {
    public ClienteDTO criar(ClienteDTO dto);

    public ClienteDTO get(UUID id);

    public void update(ClienteDTO dto);

    public void deleteById(String id);

    public List<ClienteDTO> getClienteList();
}
