package com.gym.service.impl;

import com.gym.dao.FormularioDao;
import com.gym.domain.Formulario;
import com.gym.service.FormularioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormularioServiceImpl implements FormularioService {
    
    @Autowired
    private FormularioDao formularioDao;

    @Override
    @Transactional
    public void save(Formulario formulario) {
        formularioDao.save(formulario);
    }

    @Override
    @Transactional
    public void delete(Formulario formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Formulario> getFormularios() {
        var lista = formularioDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Formulario getFormulario(Formulario formulario) {
        return formularioDao.findById(formulario.getIdFormulario()).orElse(null);
    }
}
