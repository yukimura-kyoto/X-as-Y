package com.seduc2.Y.controller;

import com.seduc2.Y.entity.Publicacao;
import com.seduc2.Y.service.PublicacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicacoes")
public class PublicacaoController {

    private final PublicacaoService service;

    public PublicacaoController(PublicacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Publicacao> mostrarPublicacoes(){
        return service.mostrarPublicacoes();
    }

    @PostMapping
    public void fazerPublicacao(@RequestBody Publicacao publicacao){
        service.fazerPublicacao(publicacao);
    }

}
