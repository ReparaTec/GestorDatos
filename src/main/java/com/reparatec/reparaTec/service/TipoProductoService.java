package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.repository.TipoProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoService {
    private final TipoProductoRepository tipoProductoRepository;

    public TipoProductoService(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    public void crearTipoProducto(TipoProducto tipoProducto) {
        tipoProductoRepository.save(tipoProducto);
    }

    public TipoProducto obtenerTipoProductoPorId(Long id) {
        return tipoProductoRepository.findById(id).orElse(null);
    }
}
