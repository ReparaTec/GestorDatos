package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.repository.TipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductServiceImpl implements TipoProductoService{

    @Autowired
    private TipoProductoRepository tipoProductoRepository;
    @Override
    public TipoProducto findById(Long id) {
        return tipoProductoRepository.findById(id).orElse(null);
    }

    @Override
    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public void saveTipoProducto(TipoProducto tipoProducto) {
        tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public void deleteTipoProducto(Long id) {
        tipoProductoRepository.deleteById(id);
    }

    @Override
    public List<TipoProducto> findByNombre(String nombre) {
        return tipoProductoRepository.findByNombre(nombre);
    }

    @Override
    public List<TipoProducto> findByEstado(Estado estado) {
        return tipoProductoRepository.findByEstado(estado);
    }
}
