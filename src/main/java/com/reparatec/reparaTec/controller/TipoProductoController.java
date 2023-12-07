package com.reparatec.reparaTec.controller;
import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.TipoProducto;
import com.reparatec.reparaTec.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-producto")
public class TipoProductoController {
    @Autowired
    private TipoProductoService tipoProductoService;

    @GetMapping("/{id}")
    public TipoProducto getTipoProductoById(@PathVariable Long id) {
        return tipoProductoService.findById(id);
    }

    @GetMapping("/tipos")
    public List<TipoProducto> getAllTipoProductos() {
        return tipoProductoService.findAll();
    }

    @PostMapping("/save")
    public void saveTipoProducto(@RequestBody TipoProducto tipoProducto) {
        tipoProductoService.saveTipoProducto(tipoProducto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTipoProducto(@PathVariable Long id) {
        tipoProductoService.deleteTipoProducto(id);
    }

    @GetMapping("/by-nombre/{nombre}")
    public List<TipoProducto> getTipoProductoByNombre(@PathVariable String nombre) {
        return tipoProductoService.findByNombre(nombre);
    }

    @GetMapping("/by-estado/{estado}")
    public List<TipoProducto> getTipoProductoByEstado(@PathVariable Estado estado) {
        return tipoProductoService.findByEstado(estado);
    }
}
