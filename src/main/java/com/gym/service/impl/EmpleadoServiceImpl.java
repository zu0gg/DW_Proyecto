package com.gym.service.impl;

import com.gym.dao.EmpleadoDao;
import com.gym.domain.Empleado;
import com.gym.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> getEmpleado() {
        List<Empleado> lista = empleadoDao.findAll();
        return lista;
    }

}
