package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {
    public ClienteDTO criar(ClienteDTO dto);

    public ClienteDTO get(String id);

    public void update(ClienteDTO dto);

    public void deleteById(String id);

    public List<ClienteDTO> getClienteList();
}
