package com.gym.domain;

import jakarta.persistence .*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
/**
 *
 * @author Shern
 */
@Data // Automaticamente crear los set y get
@Entity
@Table (name="formularios")
public class Formulario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType. IDENTITY)
    @Column (name = "id_formulario")
    private Long idFormulario;
    private String nombre;
    private String telefono; 
    private String correoCliente; 
    private String mensajeCliente; 
    
    @OneToMany
    @JoinColumn(name="id_formulario", insertable = false, updatable = false)
    List<Formulario> formulario;

    public Formulario() {
    }

    public Formulario(String nombre, String telefono, String correoCliente, String mensajeCliente) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoCliente = correoCliente;
        this.mensajeCliente = mensajeCliente;
    }
}
