package br.com.fiap.parquimetro.controller;

import br.com.fiap.parquimetro.dto.VeiculoDTO;
import br.com.fiap.parquimetro.service.VeiculoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @PostMapping
    public ResponseEntity<VeiculoDTO> criar(@RequestBody VeiculoDTO veiculoDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(veiculoDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoDTO> get(@PathVariable String id){
        return ResponseEntity.ok().body(service.get(id));
    }

    @GetMapping("/bycliente/{id}")
    public ResponseEntity<List<VeiculoDTO>> getByClienteId(@PathVariable String id){
        return ResponseEntity.ok().body(service.getByClienteId(id));
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody VeiculoDTO veiculoDTO){
        service.update(veiculoDTO);
        return ResponseEntity.ok().build();
    }
}
