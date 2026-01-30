package com.turmatds2.tds2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;
    
    private String rua; 
    private String numero;
    private String bairro;
    private String cep;


    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cep;
    }
    public void setCpf(String cep) {
        this.cep = cep;
    }

}
