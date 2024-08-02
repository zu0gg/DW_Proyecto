package com.gym.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "membresias")
public class Membresia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membresia_id")
    private Long membresiaId;

    private String tipo;
    private BigDecimal precio;
    private int duracion;

    public Membresia() {
    }

    public Membresia(String tipo, BigDecimal precio, int duracion) {
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
    }
    
    
}
