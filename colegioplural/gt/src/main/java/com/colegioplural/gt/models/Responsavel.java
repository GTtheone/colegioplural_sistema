package com.colegioplural.gt.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table
public class Responsavel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name="id")
    private Integer id;

    @Column (name="nome_responsavel")
    private String nomeResponsavel;

    @Column(name="telefone")
    private String telefone;

     @Column(name="cpf_responsavel")
    private String cpfResponsavel;

    @Column(name="datanascimento")
    private LocalDateTime dataNascimento;

    @Column(name="aluno_id")
    private Integer alunoId;

    @Column(name="atendimento_id")
    private Integer atendimentoId;

    public Responsavel(Integer id, String nomeResponsavel, String telefone, String cpfResponsavel,
            LocalDateTime dataNascimento, Integer alunoId, Integer atendimentoId) {
        this.id = id;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.cpfResponsavel = cpfResponsavel;
        this.dataNascimento = dataNascimento;
        this.alunoId = alunoId;
        this.atendimentoId = atendimentoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getAtendimentoId() {
        return atendimentoId;
    }

    public void setAtendimentoId(Integer atendimentoId) {
        this.atendimentoId = atendimentoId;
    }

}

