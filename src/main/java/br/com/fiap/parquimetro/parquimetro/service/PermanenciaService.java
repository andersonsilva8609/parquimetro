package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.PermanenciaDTO;

import java.util.List;

public interface PermanenciaService {
    public PermanenciaDTO criar(PermanenciaDTO dto);

    public PermanenciaDTO get(String id);

    public List<PermanenciaDTO> getByClienteId(String id);

    public void update(PermanenciaDTO dto);
}
