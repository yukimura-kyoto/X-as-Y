package com.seduc2.Y.service;

import com.seduc2.Y.entity.Publicacao;
import com.seduc2.Y.repository.PublicacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacaoService {

    private final PublicacaoRepository publicacaoRepository;

    public PublicacaoService(PublicacaoRepository publicacaoRepository) {
        this.publicacaoRepository = publicacaoRepository;
    }

    public List<Publicacao> mostrarPublicacoes(){
        return publicacaoRepository.findAll();
    }
}
