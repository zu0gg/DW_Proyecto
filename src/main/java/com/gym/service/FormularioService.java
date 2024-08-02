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
