package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.ItemPedido;
import com.turmatds2.tds2.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
    private final  ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService( ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository =itemPedidoRepository;
    }

    public List<ItemPedido> listarTodas() {
        return itemPedidoRepository.findAll();
    }

    public  ItemPedido salvar( ItemPedido itemPedido ) {
        return itemPedidoRepository.save(itemPedido);
    }

    public  ItemPedido buscarPorId(Long id) {
        return itemPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item Pedido não encontrada"));
    }

    public void deletar(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}

