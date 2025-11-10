package com.turnoya.turnoya.controller;

import com.turnoya.turnoya.model.Postulacion;
import com.turnoya.turnoya.repository.PostulacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postulaciones")
@CrossOrigin(origins = "*")
public class PostulacionController {

    @Autowired
    private PostulacionRepository postulacionRepository;

    // 🟢 Crear nueva postulación
    @PostMapping
    public Postulacion crearPostulacion(@RequestBody Postulacion postulacion) {
        return postulacionRepository.save(postulacion);
    }

    // 🟢 Obtener postulaciones por turno (para empresas)
    @GetMapping("/{turnoId}")
    public List<Postulacion> obtenerPorTurno(@PathVariable Long turnoId) {
        return postulacionRepository.findByTurnoId(turnoId);
    }
}
