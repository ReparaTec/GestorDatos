package com.reparatec.reparaTec.controller;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.service.ProductServiceImpl;
import com.reparatec.reparaTec.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class ProductoController {
    private final ProductServiceImpl productoService;

    public ProductoController(ProductServiceImpl productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Product> obtenerProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/by-estado/{estado}")
    public List<Product> getProductsByEstado(@PathVariable Estado estado) {
        return productoService.findByEstado(estado);
    }

    @GetMapping("/producto/{id}")
    public ResponseEntity<Product> obtenerProductoPorId(@PathVariable Long id) {
        Product producto = productoService.obtenerProductoPorId(id);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crearproducto")
    public ResponseEntity<?> crearProducto(@RequestBody Product producto) {
        try {
            productoService.crearProducto(producto);
            return ResponseEntity.ok("Producto creado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el producto");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarProducto(@PathVariable Long id, @RequestBody Product producto) {
        // Puedes agregar lógica para validar que el producto con el ID proporcionado exista antes de actualizarlo
        productoService.actualizarProducto(producto);
        return ResponseEntity.ok("Producto actualizado exitosamente");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.ok("Producto eliminado exitosamente");
    }

    @GetMapping("/activos")
    public ResponseEntity<List<Product>> obtenerProductosActivos() {
        List<Product> productosActivos = productoService.obtenerProductosPorEstadoActivo();
        return new ResponseEntity<>(productosActivos, HttpStatus.OK);
    }
    @GetMapping("/inactivos")
    public ResponseEntity<List<Product>> obtenerProductosInactivos() {
        List<Product> productosInactivos = productoService.obtenerProductosPorEstadoInactivo();
        return new ResponseEntity<>(productosInactivos, HttpStatus.OK);
    }

}
