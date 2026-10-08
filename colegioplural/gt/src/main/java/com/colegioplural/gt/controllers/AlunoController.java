package com.colegioplural.gt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegioplural.gt.models.Aluno;
import com.colegioplural.gt.models.Responsavel;
import com.colegioplural.gt.services.AlunoService;



@RestController
@RequestMapping("/Aluno")
public class AlunoController {

    private final AlunoService alunoService;
    @Autowired 
    private AlunoService AlunoService;

    AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/contar-Alunos")
public Long contarAlunos() {
    return alunoService.contarAlunos();
}

@GetMapping("/buscar-Alunos/{id}")
public Aluno buscarAluno(@PathVariable Integer id) {
    return alunoService.buscarAluno(id);
}

@GetMapping("/listar-Alunos")
public List<Aluno> listarAlunos() {
     return alunoService.listarAlunos();
}

@PostMapping("/cadastrar-aluno")
public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
    return alunoService.cadastrarAluno(aluno);
}
    
}
