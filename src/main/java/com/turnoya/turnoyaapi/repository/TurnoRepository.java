package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository
        extends JpaRepository<Turno, Integer> {
}
