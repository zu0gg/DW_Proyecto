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
}
