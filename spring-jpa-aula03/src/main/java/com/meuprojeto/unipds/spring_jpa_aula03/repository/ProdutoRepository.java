package com.meuprojeto.unipds.spring_jpa_aula03.repository;

import com.meuprojeto.unipds.spring_jpa_aula03.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}