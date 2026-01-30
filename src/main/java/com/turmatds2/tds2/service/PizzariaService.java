package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Pizzaria;
import com.turmatds2.tds2.repository.PizzariaRepository;

@Service
public class PizzariaService {
    private final PizzariaRepository pizzariaRepository;

    public PizzariaService(PizzariaRepository pizzariaRepository) {
        this.pizzariaRepository = pizzariaRepository;
    }

    public List <Pizzaria> listarTodas() {
        return pizzariaRepository.findAll();
    }

    public Pizzaria salvar(Pizzaria pizzaria) {
        return pizzariaRepository.save(pizzaria);
    }

    public Pizzaria buscarPorId(Long id) {
        return pizzariaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pizzaria não encontrada"));
    }

    public void deletar(Long id) {
        pizzariaRepository.deleteById(id);
    }
}
