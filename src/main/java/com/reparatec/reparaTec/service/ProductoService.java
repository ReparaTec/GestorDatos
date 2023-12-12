package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.models.TipoProducto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Product> obtenerTodosLosProductos();

    Optional<Product> buscarPorCodigoDeBarras(String codigoDeBarras);

    Product obtenerProductoPorId(Long id);

    List<Product> buscarPorTipo(TipoProducto tipoProducto);

    void crearProducto(Product producto);
    List<Product> findByEstado(Estado estado);
    void actualizarProducto(Product producto);
    void eliminarProducto(Long id);
    List<Product> obtenerProductosPorEstadoActivo();
    List<Product> obtenerProductosPorEstadoInactivo();
}
