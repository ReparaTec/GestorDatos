package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductRepository productoRepository;

    public ProductoService(ProductRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Optional<Product> buscarPorCodigoDeBarras(String codigoDeBarras) {
        return productoRepository.findByCodigoDeBarras(codigoDeBarras);
    }

    public Product obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
    public List<Product> buscarPorTipo(TipoProducto tipoProducto) {
        return productoRepository.findByTipoProducto(tipoProducto);
    }
    public void crearProducto(Product producto) {
        productoRepository.save(producto);
    }
    public List<Product> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}
