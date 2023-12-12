package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductoService{
    private final ProductRepository productoRepository;

    public ProductServiceImpl(ProductRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Product > obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Product> buscarPorCodigoDeBarras(String codigoDeBarras) {
        return productoRepository.findByCodigoDeBarras(codigoDeBarras);
    }

    @Override
    public Product obtenerProductoPorId(Long id) {
        return null;
    }

    @Override
    public List<Product> buscarPorTipo(TipoProducto tipoProducto) {
        return productoRepository.findByTipoProducto(tipoProducto);
    }

    @Override
    public void crearProducto(Product producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Product> findByEstado(Estado estado) {
        return productoRepository.findByEstado(estado);
    }

    @Override
    public void actualizarProducto(Product producto) {
        productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Product> obtenerProductosPorEstadoActivo() {
        return productoRepository.findByEstadoActivoTrue();
    }

    @Override
    public List<Product> obtenerProductosPorEstadoInactivo() {
        return productoRepository.findByEstadoActivoFalse();
    }

}
