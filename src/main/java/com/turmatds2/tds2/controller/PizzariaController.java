package com.turmatds2.tds2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turmatds2.tds2.model.Pizzaria;
import com.turmatds2.tds2.service.PizzariaService;

@RestController
@RequestMapping("/pizzaria")
public class PizzariaController {

    private final PizzariaService pizzariaService;

    public PizzariaController(PizzariaService pizzariaService) {
        this.pizzariaService = pizzariaService;
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String(); 
    }
    
    public List<Pizzaria> listar() {
        return pizzariaService.listarTodas();
    }

    @PostMapping
    public Pizzaria criar(@RequestBody Pizzaria pizzaria) {
        return pizzariaService.salvar(pizzaria);
    }

    @GetMapping("/{id}")
    public Pizzaria buscarPorId(@PathVariable Long id) {
        return pizzariaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pizzariaService.deletar(id);
    }
}
