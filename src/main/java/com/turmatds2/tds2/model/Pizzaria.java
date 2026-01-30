package com.turmatds2.tds2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizzaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;
     
    private String nome;
    private String cnpj; 

    public String getnome() {
    return nome;
    }
    public void setnome (String nome){
    this.nome = nome;
    }

    public String getCnpj() {
    return cnpj;
}
public void setCnpj(String cnpj){
    this.cnpj = cnpj;   
}
}
