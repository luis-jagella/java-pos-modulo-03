package com.meuprojeto.unipds.spring_jpa_aula03.repository;

import com.meuprojeto.unipds.spring_jpa_aula03.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}