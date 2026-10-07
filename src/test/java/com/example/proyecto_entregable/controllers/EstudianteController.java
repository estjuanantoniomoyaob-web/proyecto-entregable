package com.example.controllers;

import com.example.models.Estudiante;
import com.example.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repo;

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return repo.findAll();
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante e) {
        return repo.save(e);
    }
}