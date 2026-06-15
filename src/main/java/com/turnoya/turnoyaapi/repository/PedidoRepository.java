package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository
        extends JpaRepository<Pedido, Integer> {
}
