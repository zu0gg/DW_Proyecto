package com.gym.controler;

import com.gym.service.AsistenciaService;
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
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    AsistenciaService asistenciaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var lista = asistenciaService.getAsistencia();
        model.addAttribute("asistencia", lista);
        model.addAttribute("totalAsistencias", lista.size());

        return "/asistencia/listado";
    }

}
