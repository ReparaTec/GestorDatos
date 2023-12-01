package com.reparatec.reparaTec.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @ManyToOne
    private Estado estado;
}
