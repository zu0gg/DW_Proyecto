package com.gym.service.impl;

import com.gym.dao.MembresiaDao;
import com.gym.domain.Membresia;
import com.gym.service.MembresiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class MembresiaServiceImpl implements MembresiaService {

    @Autowired
    private MembresiaDao membresiaDao;

    @Override
    public List<Membresia> getMembresia() {
        List<Membresia> lista = membresiaDao.findAll();
        return lista;
    }

}
