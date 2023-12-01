package com.reparatec.reparaTec.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;
    private String codigo;
    @ManyToOne
    private Estado estado;
    @ManyToOne
    private TipoProducto tipoProducto;
    @ManyToMany(mappedBy = "productos")
    private List<Venta> ventas;
}
