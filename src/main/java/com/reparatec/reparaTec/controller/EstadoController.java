package com.reparatec.reparaTec.controller;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.service.EstadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {
    private final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public List<Estado> obtenerTodosLosEstados() {
        return estadoService.obtenerTodosLosEstados();
    }

    @GetMapping("/{id}")
    public Optional<Estado> obtenerEstadoPorId(@PathVariable Long id) {
        return estadoService.obtenerEstadoPorId(id);
    }

}
