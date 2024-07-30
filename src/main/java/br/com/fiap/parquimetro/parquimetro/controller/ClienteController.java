package br.com.fiap.parquimetro.controller;

import br.com.fiap.parquimetro.dto.ClienteDTO;
import br.com.fiap.parquimetro.service.impl.ClienteServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteService;

    @PostMapping()
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody @Valid ClienteDTO clienteDTO) {
        return new ResponseEntity<>(clienteService.criar(clienteDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> obterCliente(@PathVariable String id) {
        return ResponseEntity.ok().body(clienteService.get(id));
    }

    @GetMapping()
    public ResponseEntity<List<ClienteDTO>> listarCliente() {
        return new ResponseEntity<>(clienteService.getClienteList(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateCliente(@RequestBody @Valid ClienteDTO clienteDTO) {
        clienteService.update(clienteDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable String id) {
        clienteService.deleteById(id);
    }
}
