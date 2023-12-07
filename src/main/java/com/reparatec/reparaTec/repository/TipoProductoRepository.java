package com.reparatec.reparaTec.repository;

import com.reparatec.reparaTec.models.Estado;
import com.reparatec.reparaTec.models.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {
    List<TipoProducto> findByEstado(Estado estado);
    List<TipoProducto> findByNombre(String nombre);
    boolean existsById(Long id);
    long count();
    List<TipoProducto> findAll();
    <S extends TipoProducto> S save(S tipoProducto);
}
