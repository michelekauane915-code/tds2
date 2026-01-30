package com.turmatds2.tds2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turmatds2.tds2.model.Pizza;
import com.turmatds2.tds2.service.PizzaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<Pizza> listar() {
        return pizzaService.listarTodas();
    }

    @PostMapping
    public Pizza criar(@RequestBody Pizza pizza) {
        return pizzaService.salvar(pizza);
    }

    @GetMapping("/{id}")
    public Pizza buscarPorId(@PathVariable Long id) {
        return pizzaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pizzaService.deletar(id);
    }
}

