package com.gym.service.impl;

import com.gym.dao.ClienteDao;
import com.gym.domain.Cliente;
import com.gym.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> getCliente() {
        List<Cliente> lista = clienteDao.findAll();
        return lista;
    }

}
