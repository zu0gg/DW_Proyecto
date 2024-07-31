package com.gym.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "asistencias")
public class Asistencia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asistencia_id")
    private Long asistenciaId;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

    private LocalDate fecha;
}
