package com.example.repositories;
import com.example.models.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EstudianteRepository extends JpaRepository<Inscripcion, Long> {
}