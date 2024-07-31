package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.VeiculoDTO;

import java.util.List;

public interface VeiculoService {
    public VeiculoDTO criar(VeiculoDTO dto);

    public VeiculoDTO get(String id);

    public List<VeiculoDTO> getByClienteId(String id);

    List<VeiculoDTO> getByClenteId(String id);

    public void update(VeiculoDTO dto);
}
