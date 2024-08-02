package com.gym.dao;

import com.gym.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adrian
 */
public interface EmpleadoDao extends JpaRepository<Empleado, Long> {

}
