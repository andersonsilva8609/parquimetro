package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.ReciboDTO;

import java.util.List;

public interface ReciboService {
    public ReciboDTO get(String id);

    public List<ReciboDTO> getByClienteId(String id);
}
