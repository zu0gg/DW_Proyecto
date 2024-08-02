package com.gym.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import lombok.Data;

@Data
@Entity
@Table(name = "clases")
public class Clase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clase_id")
    private Long claseId;

    private String nombre;
    private String descripcion;
    private LocalTime horario;
    private int duracion;

    public Clase() {
    }

    public Clase(String nombre, String descripcion, LocalTime horario, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.duracion = duracion;
    }

}
