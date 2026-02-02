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

import com.turmatds2.tds2.model.Entregador;
import com.turmatds2.tds2.service.EntregadorService;

 @RestController
@RequestMapping("/Entregadores")
public class EntregadorController {

    private final EntregadorService entregadorService;

    public EntregadorController(EntregadorService entregadorService) {
        this.entregadorService = entregadorService;
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<Entregador> listar() {
        return entregadorService.listarTodas();
    }

    @PostMapping
    public Entregador criar(@RequestBody Entregador entregador) {
        return entregadorService.salvar(entregador);
    }

    @GetMapping("/{id}")
    public Entregador buscarPorId(@PathVariable Long id) {
        return entregadorService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        EntregadorService.deletar(id);
    }  
}
