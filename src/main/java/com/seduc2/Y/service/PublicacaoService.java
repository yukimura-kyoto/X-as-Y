package com.seduc2.Y.service;

import com.seduc2.Y.entity.Publicacao;
import com.seduc2.Y.repository.PublicacaoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicacaoService {

    private final PublicacaoRepository repository;

    public PublicacaoService(PublicacaoRepository repository) {
        this.repository = repository;
    }

    public List<Publicacao> mostrarPublicacoes(){
        List<Publicacao> lista = new ArrayList<>();
        lista = repository.findAll();
        return lista;
    }

    public void fazerPublicacao(Publicacao p){
        Publicacao pub = new Publicacao();
        pub.setUsuario(p.getUsuario());
        pub.setLegenda(p.getLegenda());
        pub.setImagem(p.getImagem());
        repository.save(pub);
    }
}
