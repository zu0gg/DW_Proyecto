package com.gym.dao;

import com.gym.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adrian
 */
public interface ClienteDao extends JpaRepository<Cliente, Long> {

}
