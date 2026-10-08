package com.colegioplural.gt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioplural.gt.models.Aluno;

public interface  AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
