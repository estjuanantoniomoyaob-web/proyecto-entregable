package com.example.controllers;

import com.example.models.Inscripcion;
import com.example.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionRepository repo;

    @GetMapping
    public List<Inscripcion> getInscripciones() {
        return repo.findAll();
    }

    @PostMapping
    public Inscripcion crearInscripcion(@RequestBody Inscripcion i) {
        return repo.save(i);
    }
}