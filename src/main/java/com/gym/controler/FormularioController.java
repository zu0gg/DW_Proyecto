/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.controler;
import com.gym.domain.Formulario;
import com.gym.service.FormularioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/formulario")
public class FormularioController {
    
    @Autowired
    private FormularioService formularioService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var formula = formularioService.getFormularios();
        model.addAttribute("formularios", formula);
        model.addAttribute("totalFormularios", formula.size());
        return "/categoria/listado";
    }
    
    @GetMapping("/nuevo")
    public String formularioNuevo(Formulario categoria) {
        return "/categoria/modifica";
    }

    @PostMapping("/guardar")
    public String formularioGuardar(Formulario categoria) { 
        formularioService.save(categoria);
        return "redirect:/formulario/listado";
    }

    @GetMapping("/eliminar/{idFormulario}")
    public String formularioEliminar(Formulario categoria) {
        formularioService.delete(categoria);
        return "redirect:/formulario/listado";
    }

    @GetMapping("/modificar/{idFormulario}")
    public String formularioModificar(Formulario formulario, Model model) {
        formulario = formularioService.getFormulario(formulario);
        model.addAttribute("formulario", formulario);
        return "/formulario/modifica";
    }
    
}
