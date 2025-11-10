package com.turnoya.turnoya.repository;

import com.turnoya.turnoya.model.Postulacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostulacionRepository extends JpaRepository<Postulacion, Long> {
    List<Postulacion> findByTurnoId(Long turnoId);
}
