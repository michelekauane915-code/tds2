package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Entregador;
import com.turmatds2.tds2.repository.EntregadorRepository;

@Service
public class EntregadorService {
      private final EntregadorRepository entregadorRepository;

    public EntregadorService(EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    public List <Entregador> listarTodas() {
        return entregadorRepository.findAll();
    }

    public Entregador salvar(Entregador entregador) {
        return entregadorRepository.save(entregador);
    }

    public Entregador buscarPorId(Long id) {
        return entregadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entregador não encontrada"));
    }

    public static void deletar(Long id) {
        entregadorRepository.deleteById(id);
    }
}
