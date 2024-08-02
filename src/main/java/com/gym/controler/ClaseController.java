package com.gym.controler;

import com.gym.service.ClaseService;
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
@RequestMapping("/clase")
public class ClaseController {

    @Autowired
    ClaseService claseService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var lista = claseService.getClase();
        model.addAttribute("clase", lista);
        model.addAttribute("totalClases", lista.size());

        return "/clase/listado";
    }

}
