package com.colegioplural.gt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioplural.gt.models.Atendimento;

public interface  AtendimentoRepository extends JpaRepository<Atendimento, Integer> {
    
}
