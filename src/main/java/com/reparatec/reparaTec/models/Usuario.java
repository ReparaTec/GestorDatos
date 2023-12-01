package com.reparatec.reparaTec.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@PrimaryKeyJoinColumn(name = "empleado_id")
@Entity
@Getter
@Setter
public class Usuario extends Pearson {
    private String usuario;
    private String pass;
    @ManyToOne
    private Estado estado;
    @OneToMany(mappedBy = "usuario")
    private List<Venta> ventas;
}
