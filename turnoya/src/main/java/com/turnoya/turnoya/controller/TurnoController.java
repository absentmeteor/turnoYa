package com.turnoya.turnoya.controller;

import com.turnoya.turnoya.model.Turno;
import com.turnoya.turnoya.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
@CrossOrigin(origins = "*") // permite peticiones desde tu HTML local o cualquier dominio
public class TurnoController {

    @Autowired
    private TurnoRepository turnoRepository;

    // 🟢 Obtener todos los turnos
    @GetMapping
    public List<Turno> getAllTurnos() {
        return turnoRepository.findAll();
    }

    // 🟢 Buscar con filtros (ciudad, categoría, pago)
    @GetMapping("/buscar")
    public List<Turno> buscarTurnos(
            @RequestParam(required = false) String ciudad,
            @RequestParam(required = false) String categoria,
            @RequestParam(required = false) Double pagoMin) {

        // 🔎 Filtrado dinámico
        if (ciudad != null && categoria != null && pagoMin != null) {
            return turnoRepository.findByCiudadAndCategoriaAndPagoGreaterThanEqual(ciudad, categoria, pagoMin);
        } else if (ciudad != null && categoria != null) {
            return turnoRepository.findByCiudadAndCategoria(ciudad, categoria);
        } else if (ciudad != null && pagoMin != null) {
            return turnoRepository.findByCiudadAndPagoGreaterThanEqual(ciudad, pagoMin);
        } else if (categoria != null && pagoMin != null) {
            return turnoRepository.findByCategoriaAndPagoGreaterThanEqual(categoria, pagoMin);
        } else if (ciudad != null) {
            return turnoRepository.findByCiudad(ciudad);
        } else if (categoria != null) {
            return turnoRepository.findByCategoria(categoria);
        } else if (pagoMin != null) {
            return turnoRepository.findByPagoGreaterThanEqual(pagoMin);
        } else {
            return turnoRepository.findAll();
        }
    }

    // 🟢 Agregar un nuevo turno (opcional)
    @PostMapping
    public Turno crearTurno(@RequestBody Turno turno) {
        return turnoRepository.save(turno);
    }
}
