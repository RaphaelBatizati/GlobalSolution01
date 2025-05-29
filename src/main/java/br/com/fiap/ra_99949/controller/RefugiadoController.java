package br.com.fiap.ra_99949.controller;

import br.com.fiap.ra_99949.dto.RefugiadoDTO;
import br.com.fiap.ra_99949.entity.Refugiado;
import br.com.fiap.ra_99949.service.RefugiadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refugiados")
public class RefugiadoController {

    @Autowired
    private RefugiadoService service;

    @PostMapping
    public ResponseEntity<Refugiado> criar(@RequestBody RefugiadoDTO dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }

    @GetMapping
    public ResponseEntity<List<Refugiado>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Refugiado> listarPorId(@PathVariable Long id) {
        return service.listarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Refugiado> atualizar(@PathVariable Long id, @RequestBody RefugiadoDTO dto) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
