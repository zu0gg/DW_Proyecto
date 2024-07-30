/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.service;

import com.gym.domain.Formulario;
import java.util.List;
/**
 *
 * @author Shern
 */
public interface FormularioService {
    public List<Formulario> getFormularios();
    
    public Formulario getFormulario(Formulario formulario);
    
    public void save(Formulario formulario);
    
    public void delete(Formulario formulario);
}
