package com.gym.controler;

import com.gym.service.MembresiaService;
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
@RequestMapping("/membresia")
public class MembresiaController {

    @Autowired
    MembresiaService membresiaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
         var lista = membresiaService.getMembresia();
        model.addAttribute("membresia", lista);
        model.addAttribute("totalMmebresias", lista.size());

        return "/membresia/listado";
    }

}
