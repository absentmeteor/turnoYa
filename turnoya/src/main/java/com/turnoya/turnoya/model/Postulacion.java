package com.turnoya.turnoya.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "postulaciones")
public class Postulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String telefono;
    private String experiencia;
    private String comentarios;
    private Long turnoId;
    private LocalDateTime fechaPostulacion;

    public Postulacion() {}

    public Postulacion(String nombre, String email, String telefono,
                       String experiencia, String comentarios, Long turnoId) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.experiencia = experiencia;
        this.comentarios = comentarios;
        this.turnoId = turnoId;
        this.fechaPostulacion = LocalDateTime.now();
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String experiencia) { this.experiencia = experiencia; }
    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
    public Long getTurnoId() { return turnoId; }
    public void setTurnoId(Long turnoId) { this.turnoId = turnoId; }
    public LocalDateTime getFechaPostulacion() { return fechaPostulacion; }
    public void setFechaPostulacion(LocalDateTime fechaPostulacion) { this.fechaPostulacion = fechaPostulacion; }
}
