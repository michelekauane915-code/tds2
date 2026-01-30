package com.turmatds2.tds2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id_cliente; 

    private String nome; 
    private String telefone;

    public int getIdCliente() {
        return id_cliente;
    } 
    public void setIdCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getnome() {
        return nome;
    }
    public void setnome (String nome){
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
 
    @ManyToOne
    @JoinColumn (name = "id_pizzaria")
    private Pizzaria pizzaria;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
