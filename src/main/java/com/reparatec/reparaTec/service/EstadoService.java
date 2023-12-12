package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> obtenerTodosLosEstados() {
        return estadoRepository.findAll();
    }

    public Optional<Estado> obtenerEstadoPorId(Long id) {
        return estadoRepository.findById(id);
    }
}
