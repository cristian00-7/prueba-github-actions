package com.turnoya.turnoyaapi.contoller;

import com.turnoya.turnoyaapi.model.Turno;
import com.turnoya.turnoyaapi.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
@CrossOrigin("*")
public class TurnoController {

    @Autowired
    private TurnoRepository repository;

    @GetMapping
    public List<Turno> listarTurnos() {
        return repository.findAll();
    }

    @PostMapping
    public Turno guardarTurno(
            @RequestBody Turno turno
    ) {
        return repository.save(turno);
    }

    @DeleteMapping("/{id}")
    public void eliminarTurno(
            @PathVariable Integer id
    ) {
        repository.deleteById(id);
    }
}