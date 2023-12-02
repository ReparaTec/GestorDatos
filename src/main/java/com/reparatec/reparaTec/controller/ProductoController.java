package com.reparatec.reparaTec.controller;

import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Product> obtenerProductos() {
        return productoService.obtenerTodosLosProductos();
    }
}
