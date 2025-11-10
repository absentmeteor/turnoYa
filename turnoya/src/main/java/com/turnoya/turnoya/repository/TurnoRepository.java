package com.turnoya.turnoya.repository;

import com.turnoya.turnoya.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

    // 🔍 Buscar por ciudad
    List<Turno> findByCiudad(String ciudad);

    // 🔍 Buscar por categoría (tipo de servicio)
    List<Turno> findByCategoria(String categoria);

    // 🔍 Buscar por pago exacto
    List<Turno> findByPago(double pago);

    // 🔍 Buscar por pago mayor o igual (útil si el usuario busca trabajos bien pagos)
    List<Turno> findByPagoGreaterThanEqual(double pago);

    // 🔍 Combinaciones de filtros
    List<Turno> findByCiudadAndCategoria(String ciudad, String categoria);

    List<Turno> findByCiudadAndPagoGreaterThanEqual(String ciudad, double pago);

    List<Turno> findByCategoriaAndPagoGreaterThanEqual(String categoria, double pago);

    // 🔍 Todos los filtros combinados
    List<Turno> findByCiudadAndCategoriaAndPagoGreaterThanEqual(String ciudad, String categoria, double pago);
}
