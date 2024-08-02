package com.gym.controler;

import com.gym.service.ClienteService;
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
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
         var lista = clienteService.getCliente();
        model.addAttribute("cliente", lista);
        model.addAttribute("totalClientes", lista.size());

        return "/cliente/listado";
       
    }
    
}
