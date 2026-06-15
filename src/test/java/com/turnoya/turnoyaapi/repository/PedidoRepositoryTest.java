package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Pedido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoRepositoryTest {

    @Test
    void clientePedido() {

        Pedido pedido = new Pedido();

        pedido.setCliente("Cristian");

        System.out.println("TEST 9 OK - Cliente Pedido");

        assertEquals(
                "Cristian",
                pedido.getCliente()
        );

    }

    @Test
    void descripcionPedido() {

        Pedido pedido = new Pedido();

        pedido.setDescripcion("Pedido prueba");

        System.out.println("TEST 10 OK - Descripcion Pedido");

        assertEquals(
                "Pedido prueba",
                pedido.getDescripcion()
        );

    }

    @Test
    void valorPedido() {

        Pedido pedido = new Pedido();

        pedido.setValor(10000.0);

        System.out.println("TEST 11 OK - Valor Pedido");

        assertEquals(
                10000.0,
                pedido.getValor()
        );

    }

    @Test
    void estadoPedido() {

        Pedido pedido = new Pedido();

        pedido.setEstado("Pendiente");

        System.out.println("TEST 12 OK - Estado Pedido");

        assertEquals(
                "Pendiente",
                pedido.getEstado()
        );

    }

}