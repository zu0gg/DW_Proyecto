package com.gym.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long clienteId;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;
    private LocalDate fechaRegistro;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String telefono, String direccion, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

}
