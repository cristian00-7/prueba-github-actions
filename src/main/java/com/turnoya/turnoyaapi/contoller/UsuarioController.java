package com.turnoya.turnoyaapi.controller;

import com.turnoya.turnoyaapi.model.Usuario;
import com.turnoya.turnoyaapi.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/registro")
    public Usuario registrar(
            @RequestBody Usuario usuario
    ) {

        return repository.save(usuario);

    }

    @PostMapping("/login")
    public String login(
            @RequestBody Usuario usuario
    ) {

        Usuario encontrado =
                repository.findByUsuarioAndContrasena(
                        usuario.getUsuario(),
                        usuario.getContrasena()
                );

        if (encontrado != null) {

            return "LOGIN_OK";

        }

        return "LOGIN_ERROR";

    }

}