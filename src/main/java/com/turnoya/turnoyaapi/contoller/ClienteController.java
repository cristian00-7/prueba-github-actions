package com.turnoya.turnoyaapi.contoller;

import com.turnoya.turnoyaapi.model.Cliente;
import com.turnoya.turnoyaapi.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    @PostMapping
    public Cliente guardarCliente(
            @RequestBody Cliente cliente
    ) {
        return repository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(
            @PathVariable Integer id
    ) {
        repository.deleteById(id);
    }
}