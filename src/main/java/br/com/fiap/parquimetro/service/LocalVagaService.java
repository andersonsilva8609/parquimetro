package br.com.fiap.parquimetro.service;

import br.com.fiap.parquimetro.dto.LocalVagaDTO;
import br.com.fiap.parquimetro.service.impl.BusinessException;

public interface LocalVagaService {

    public LocalVagaDTO buscarLocalVaga(String id) throws BusinessException;

    public LocalVagaDTO salvarVaga(LocalVagaDTO localVagaDTO);

    public LocalVagaDTO update(String id, LocalVagaDTO localVagaDTO);

    public void deleteById(String id);

}
