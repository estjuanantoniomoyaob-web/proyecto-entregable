package com.example.controllers;

import com.example.models.Estudiante;
import com.example.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}