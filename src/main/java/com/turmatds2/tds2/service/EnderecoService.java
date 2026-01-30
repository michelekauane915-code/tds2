package com.turmatds2.tds2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.turmatds2.tds2.model.Endereco;
import com.turmatds2.tds2.repository.EnderecoRepository;
 
@Service
public class EnderecoService {
     private final  EnderecoRepository enderecoRepository;

    public  EnderecoService( EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public List<Endereco> listarTodas() {
        return enderecoRepository.findAll();
    }

    public  Endereco salvar( Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public  Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereco não encontrada"));
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }
}
