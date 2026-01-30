package com.turmatds2.tds2.model;

import jakarta.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    private int quantidade;
    private int valor_venda;
    
 
    public int getQuantidade() {
        return quantidade;
    }
     public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValorVenda(int valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    public int getValorVenda() {
        return valor_venda;
    }

    @ManyToOne
    @JoinColumn (name = "id_pedido")
    private Pedido pedido;

     @OneToOne
    @JoinColumn (name = "cod_pizza")
    private Pizza pizza;


}
 