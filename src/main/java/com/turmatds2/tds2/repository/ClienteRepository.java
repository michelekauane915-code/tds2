package com.turmatds2.tds2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.turmatds2.tds2.model.Cliente;

public  interface ClienteRepository extends JpaRepository<Cliente, Integer>{  
}
