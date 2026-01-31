package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Pedido;
import com.turmatds2.tds2.repository.PedidoRepository;

@Service
public class PedidoService {
    private final  PedidoRepository pedidoRepository;

    public PedidoService( PedidoRepository PedidoRepository) {
        this.pedidoRepository =PedidoRepository;
    }

    public List<Pedido> listarTodas() {
        return pedidoRepository.findAll();
    }

    public  Pedido salvar( Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public  Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrada"));
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}

