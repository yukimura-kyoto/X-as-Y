package com.seduc2.Y.repository;

import com.seduc2.Y.entity.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Integer> {
}
