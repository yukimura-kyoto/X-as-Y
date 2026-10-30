package com.seduc2.Y.controller;

import com.seduc2.Y.entity.Publicacao;
import com.seduc2.Y.service.PublicacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/publicacoes")
public class PublicacaoController {

    private final PublicacaoService publicacaoService;

    public PublicacaoController(PublicacaoService publicacaoService) {
        this.publicacaoService = publicacaoService;
    }

    @GetMapping
    public List<Publicacao> mostrarPublicacoes(){
        return publicacaoService.mostrarPublicacoes();
    }

}
