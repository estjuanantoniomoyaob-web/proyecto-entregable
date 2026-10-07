package com.example.repositories;
import com.example.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}