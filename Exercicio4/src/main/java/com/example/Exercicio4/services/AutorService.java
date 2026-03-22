package com.example.Exercicio4.services;

import java.util.List;

import com.example.Exercicio4.models.AutorModel;
import com.example.Exercicio4.repositories.AutorRepository;
import org.springframework.stereotype.Service;


@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorModel criarAutor(AutorModel autor) {
        return autorRepository.save(autor);
    }

    public List<AutorModel> listarAutores() {
        return autorRepository.findAll();
    }

    public AutorModel buscarPorId(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public void deletarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}