package com.colegioplural.gt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colegioplural.gt.models.Responsavel;
import com.colegioplural.gt.services.ResponsavelService;


@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {

    @Autowired 
    private ResponsavelService responsavelService;

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

public Long contarResponsavels() {
    return responsavelService.contarResponsavels();
}

@GetMapping("/buscar-responsavels/{id}")
public Responsavel buscarResponsavel(@PathVariable Integer id) {
    return responsavelService.buscarResponsavel(id);
}

@GetMapping("/listar-responsavels")
public List<Responsavel> listarResponsavels() {
     return responsavelService.listarResponsavels();
}
public ResponsavelService getResponsavelService() {
    return responsavelService;
}
public void setResponsavelService(ResponsavelService responsavelService) {
    this.responsavelService = responsavelService;
}

@PostMapping("/cadastrar-responsavel")
public Responsavel cadastrarResponsavel(@RequestBody Responsavel responsavel) {
    return responsavelService.cadastrarResponsavel(responsavel);
}
    
}