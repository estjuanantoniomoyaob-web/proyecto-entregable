package com.example.controllers;

import com.example.models.Carrera;
import com.example.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carrera")
public class CarreraController {

    @Autowired
    private CarreraRepository repo;

    @GetMapping
    public List<Carrera> getCarreras() {
        return repo.findAll();
    }

    @PostMapping
    public Carrera crearCarrera(@RequestBody Carrera c) {
        return repo.save(c);
    }
}