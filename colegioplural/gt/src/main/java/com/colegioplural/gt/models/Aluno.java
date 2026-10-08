package com.colegioplural.gt.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name="aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    @Column(name="cpf", unique = true )
    private String cpf;

    @Column(name="endereco")
    private String endereco;

    @ManyToOne 
    @JoinColumn(name="responsavel_id")
    private Responsavel responsavel;

    public Aluno(Integer id, String nome, LocalDate dataNascimento, String cpf, String endereco,
            Responsavel responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

} 

