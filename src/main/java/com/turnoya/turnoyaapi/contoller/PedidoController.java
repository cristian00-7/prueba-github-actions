package com.turnoya.turnoyaapi.controller;

import com.turnoya.turnoyaapi.model.Pedido;
import com.turnoya.turnoyaapi.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }

    @PostMapping
    public Pedido guardarPedido(
            @RequestBody Pedido pedido
    ) {
        return repository.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(
            @PathVariable Integer id
    ) {
        repository.deleteById(id);
    }
}
