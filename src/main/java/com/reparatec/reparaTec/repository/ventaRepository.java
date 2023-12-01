package com.reparatec.reparaTec.repository;

import com.reparatec.reparaTec.models.Client;
import com.reparatec.reparaTec.models.Usuario;
import com.reparatec.reparaTec.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ventaRepository extends JpaRepository<Venta, Long> {
    List<Venta> findByUsuario(Usuario usuario);
    List<Venta> findByCliente(Client cliente);
    List<Venta> findByPagada(boolean pagada);
}
