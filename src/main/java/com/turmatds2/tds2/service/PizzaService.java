package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Pizza;
import com.turmatds2.tds2.repository.PizzaRepository;

@Service
public class PizzaService {
    
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> listarTodas() {
        return pizzaRepository.findAll();
    }

    public Pizza salvar(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza buscarPorId(Long id) {
        return pizzaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pizza não encontrada"));
    }

    public void deletar(Long id) {
        pizzaRepository.deleteById(id);
    }
}
