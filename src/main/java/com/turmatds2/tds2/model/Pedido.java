package com.turmatds2.tds2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id_cliente;
    
 
    private String data;
    private String hora;
   
    
    
    public String getData() {
        return data;
    }
    public void setData (String data){
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }


    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente; 

    @ManyToOne
    @JoinColumn(name = "id")
    private Entregador entregador;
}
