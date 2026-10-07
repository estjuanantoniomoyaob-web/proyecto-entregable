package com.example.repositories;
import com.example.models.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}