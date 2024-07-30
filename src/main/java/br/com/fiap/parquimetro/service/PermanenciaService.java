package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.PermanenciaDTO;

import java.util.List;
import java.util.UUID;

public interface PermanenciaService {
    public PermanenciaDTO criar(PermanenciaDTO dto);

    public PermanenciaDTO get(UUID id) throws Throwable;

    public List<PermanenciaDTO> getByClienteId(String id);

    public void update(PermanenciaDTO dto) throws Throwable;
}
