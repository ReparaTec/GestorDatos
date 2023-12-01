package com.reparatec.reparaTec.repository;
import com.reparatec.reparaTec.models.Product;
import com.reparatec.reparaTec.models.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByCodigoDeBarras(String codigoDeBarras);

    List<Product> findByTipoProducto(TipoProducto tipoProducto);

}
