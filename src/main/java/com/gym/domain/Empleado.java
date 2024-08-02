package com.gym.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empleado_id")
    private Long empleadoId;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String puesto;
    private LocalDate fechaContratacion;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String correo, String telefono, String puesto, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.puesto = puesto;
        this.fechaContratacion = fechaContratacion;
    }

}
