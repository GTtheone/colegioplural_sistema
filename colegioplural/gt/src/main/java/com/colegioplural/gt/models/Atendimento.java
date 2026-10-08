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
@Table(name="atendimento")
public class Atendimento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name="id")
    private Integer id;

    @Column(name="data_hora")
    private LocalDate dataHora;

    @JoinColumn(name="atendimento_id")
    private Integer atendimento;

    public Atendimento(Integer id, LocalDate dataHora, Integer atendimento) {
        this.id = id;
        this.dataHora = dataHora;
        this.atendimento = atendimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Integer atendimento) {
        this.atendimento = atendimento;
    }
}

