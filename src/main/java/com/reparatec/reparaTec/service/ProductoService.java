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

    public List<Product> buscarPorTipo(TipoProducto tipoProducto) {
        return productoRepository.findByTipoProducto(tipoProducto);
    }
}
