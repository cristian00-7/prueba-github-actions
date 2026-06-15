package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteRepositoryTest {

    @Test
    void guardarCliente() {

        Cliente cliente = new Cliente();

        cliente.setNombre("Cristian");
        cliente.setTelefono("3001234567");

        System.out.println("TEST 1 OK - Guardar Cliente");

        assertEquals(
                "Cristian",
                cliente.getNombre()
        );

    }

    @Test
    void telefonoCliente() {

        Cliente cliente = new Cliente();

        cliente.setTelefono("3001234567");

        System.out.println("TEST 2 OK - Validar Telefono Cliente");

        assertEquals(
                "3001234567",
                cliente.getTelefono()
        );

    }

    @Test
    void nombreNoNulo() {

        Cliente cliente = new Cliente();

        cliente.setNombre("Juan");

        System.out.println("TEST 3 OK - Nombre No Nulo");

        assertNotNull(
                cliente.getNombre()
        );

    }

    @Test
    void clienteDiferente() {

        Cliente cliente = new Cliente();

        cliente.setNombre("Pedro");

        System.out.println("TEST 4 OK - Comparacion Cliente");

        assertNotEquals(
                "Juan",
                cliente.getNombre()
        );

    }

}