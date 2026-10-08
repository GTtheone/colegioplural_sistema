package com.colegioplural.gt.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.colegioplural.gt.models.Atendimento;
import com.colegioplural.gt.services.AtendimentoService;


@Controller 
public class AtendimentoController {

  @GetMapping("/contar-atendimentos")
    public Long contaratendimentos() {
  return AtendimentoService.contarAtendimentos();

}

@GetMapping("/buscar-atendimentos/{id}")
public Atendimento buscaratendimento(@PathVariable Integer id) {
    return AtendimentoService.buscarAtendimento(id);
}



@GetMapping("/listar-atendimentos")
public List<Atendimento> listaratendimentos() {
return AtendimentoService.listarAtendimentos();

}

}