package com.example.Exercicio4.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Autor")
@Table(name = "tb_autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name = "pais_origem")
    private String nacionalidade;

    @Column(name = "data_nascimento_autor")
    private LocalDate dataNascimento;

    public AutorModel() {
    }

    public AutorModel(Long id, String nome, String nacionalidade, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}