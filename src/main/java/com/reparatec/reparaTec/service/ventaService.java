package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Venta;
import com.reparatec.reparaTec.repository.ventaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ventaService {
    private final ventaRepository ventaRepositorys;

    public ventaService(ventaRepository ventaRepositorys) {
        this.ventaRepositorys = ventaRepositorys;
    }

    public List<Venta> obtenerVentasPendientes() {
        return ventaRepositorys.findByPagada(false);
    }

    public List<Venta> obtenerVentasPagadas() {
        return ventaRepositorys.findByPagada(true);
    }
    public void crearVenta(Venta venta) {
        ventaRepositorys.save(venta);
    }

    public Venta obtenerVentaPorId(Long id) {
        return ventaRepositorys.findById(id).orElse(null);
    }

}
