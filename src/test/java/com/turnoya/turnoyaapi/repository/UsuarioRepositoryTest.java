package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRepositoryTest {

    @Test
    void usuarioCorrecto() {

        Usuario usuario = new Usuario();

        usuario.setUsuario("cristian");

        System.out.println("TEST 13 OK - Usuario Correcto");

        assertEquals(
                "cristian",
                usuario.getUsuario()
        );

    }

    @Test
    void contrasenaCorrecta() {

        Usuario usuario = new Usuario();

        usuario.setContrasena("123456");

        System.out.println("TEST 14 OK - Contrasena Correcta");

        assertEquals(
                "123456",
                usuario.getContrasena()
        );

    }

    @Test
    void usuarioNoNulo() {

        Usuario usuario = new Usuario();

        usuario.setUsuario("admin");

        System.out.println("TEST 15 OK - Usuario No Nulo");

        assertNotNull(
                usuario.getUsuario()
        );

    }

}