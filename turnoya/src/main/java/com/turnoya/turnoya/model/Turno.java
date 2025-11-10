package com.turnoya.turnoya.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;        // Ej: "Mesero para boda"
    private String categoria;     // Ej: "Eventos", "Técnico", "Hogar", etc.
    private LocalDate fecha;      // Ej: 2025-11-10
    private String direccion;     // Ej: "Cra 15 #45-23"
    private String ciudad;        // Ej: "Bogotá"
    private double pago;          // Ej: 60000.0
    private String descripcion;   // Opcional, breve info del trabajo
    private String empresa;       // Quién publicó el turno (opcional)

    public Turno() {}

    public Turno(String titulo, String categoria, LocalDate fecha, String direccion,
                 String ciudad, double pago, String descripcion, String empresa) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pago = pago;
        this.descripcion = descripcion;
        this.empresa = empresa;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
