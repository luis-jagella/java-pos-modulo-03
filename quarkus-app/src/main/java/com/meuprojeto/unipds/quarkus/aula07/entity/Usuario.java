package com.meuprojeto.unipds.quarkus.aula07.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Usuario extends PanacheEntity {

    public String nome;

}