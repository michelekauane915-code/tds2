package com.turmatds2.tds2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turmatds2.tds2.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
