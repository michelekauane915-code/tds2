package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Cliente;
import com.turmatds2.tds2.repository.ClienteRepository;

@Service
public class ClienteService {
     private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodas() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrada"));
    }

    public void deletar(Integer id) {
        clienteRepository.deleteById(id);
    }
}
