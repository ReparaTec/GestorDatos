package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public void crearEstado(Estado estado) {
        estadoRepository.save(estado);
    }

    public Estado obtenerEstadoPorId(Long id) {
        return estadoRepository.findById(id).orElse(null);
    }
}
