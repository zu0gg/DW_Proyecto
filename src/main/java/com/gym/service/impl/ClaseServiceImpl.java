package com.gym.service.impl;

import com.gym.dao.ClaseDao;
import com.gym.domain.Clase;
import com.gym.service.ClaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class ClaseServiceImpl implements ClaseService {

    @Autowired
    private ClaseDao claseDao;

    @Override
    public List<Clase> getClase() {
        List<Clase> lista = claseDao.findAll();
        return lista;
    }

}
