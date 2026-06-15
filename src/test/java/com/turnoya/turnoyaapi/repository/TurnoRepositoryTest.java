package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Turno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurnoRepositoryTest {

    @Test
    void clienteTurno() {

        Turno turno = new Turno();

        turno.setCliente("Cristian");

        System.out.println("TEST 5 OK - Cliente Turno");

        assertEquals(
                "Cristian",
                turno.getCliente()
        );

    }

    @Test
    void fechaTurno() {

        Turno turno = new Turno();

        turno.setFecha("2025-06-10");

        System.out.println("TEST 6 OK - Fecha Turno");

        assertEquals(
                "2025-06-10",
                turno.getFecha()
        );

    }

    @Test
    void horaTurno() {

        Turno turno = new Turno();

        turno.setHora("10:00");

        System.out.println("TEST 7 OK - Hora Turno");

        assertEquals(
                "10:00",
                turno.getHora()
        );

    }

    @Test
    void estadoTurno() {

        Turno turno = new Turno();

        turno.setEstado("Activo");

        System.out.println("TEST 8 OK - Estado Turno");

        assertEquals(
                "Activo",
                turno.getEstado()
        );

    }

}