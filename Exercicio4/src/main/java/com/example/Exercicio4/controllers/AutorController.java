package com.example.Exercicio4.controllers;

import java.util.List;

import com.example.Exercicio4.models.AutorModel;
import com.example.Exercicio4.services.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public ResponseEntity<AutorModel> criarAutor(@RequestBody AutorModel autor) {
        AutorModel novoAutor = autorService.criarAutor(autor);
        return ResponseEntity.status(201).body(novoAutor);
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> listarAutores() {
        return ResponseEntity.ok(autorService.listarAutores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> buscarAutor(@PathVariable Long id) {

        AutorModel autor = autorService.buscarPorId(id);

        if (autor == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(autor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAutor(@PathVariable Long id) {

        AutorModel autor = autorService.buscarPorId(id);

        if (autor == null) {
            return ResponseEntity.notFound().build();
        }

        autorService.deletarAutor(id);
        return ResponseEntity.noContent().build();
    }
}