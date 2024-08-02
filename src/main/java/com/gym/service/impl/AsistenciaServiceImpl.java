package com.gym.service.impl;

import com.gym.dao.AsistenciaDao;
import com.gym.domain.Asistencia;
import com.gym.service.AsistenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class AsistenciaServiceImpl implements AsistenciaService {

    @Autowired
    private AsistenciaDao asistenciaDao;

    @Override
    public List<Asistencia> getAsistencia() {
        List<Asistencia> lista = asistenciaDao.findAll();
        return lista;
    }

}
