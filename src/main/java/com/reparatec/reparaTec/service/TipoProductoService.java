package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.repository.TipoProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TipoProductoService {
    TipoProducto findById(Long id);
    List<TipoProducto> findAll();
    void saveTipoProducto(TipoProducto tipoProducto);
    void deleteTipoProducto(Long id);
    List<TipoProducto> findByNombre(String nombre);
    List<TipoProducto> findByEstado(Estado estado);
}
