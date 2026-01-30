package com.turmatds2.tds2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entregador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;

    private String nome;

  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
