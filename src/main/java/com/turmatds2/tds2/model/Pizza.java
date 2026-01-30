package com.turmatds2.tds2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;
    
  private String nome;
  private Double preco;


public String getnome() {
    return nome;
    }
public void setnome (String nome){
    this.nome = nome;
    }

public double getPreco() {
    return preco;
}
public void setPreco(double preco){
    this.preco = preco;
}

   @OneToOne
    @JoinColumn (name = "id_item")
    private ItemPedido itemPedido;
}
