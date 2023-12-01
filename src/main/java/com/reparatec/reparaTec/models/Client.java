package com.reparatec.reparaTec.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//@PrimaryKeyJoinColumn(name = "cliente_id")
@Entity
@Getter
@Setter
public class Client extends Pearson{
    private String tipoCliente;

    @ManyToOne
    private Estado estado;
    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;
}
