package com.gym.controler;

import com.gym.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Adrian
 */
@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var lista = empleadoService.getEmpleado();
        model.addAttribute("empleado", lista);
        model.addAttribute("totalEmpleados", lista.size());

        return "/empleado/listado";
    }

}
