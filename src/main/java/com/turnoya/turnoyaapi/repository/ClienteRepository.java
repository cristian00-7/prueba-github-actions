package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<Cliente, Integer> {

}
