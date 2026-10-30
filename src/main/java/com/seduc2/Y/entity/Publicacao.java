package com.seduc2.Y.entity;

import jakarta.persistence.*;

@Entity
public class Publicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String legenda;
    @Column(length = 1000)
    private String imagem;

    public Publicacao(){}

    public Publicacao(String imagem, String legenda, String usuario) {
        this.imagem = imagem;
        this.legenda = legenda;
        this.usuario = usuario;
    }

    public Publicacao(Long id, String usuario, String legenda, String imagem) {
        this.id = id;
        this.usuario = usuario;
        this.legenda = legenda;
        this.imagem = imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", legenda='" + legenda + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
