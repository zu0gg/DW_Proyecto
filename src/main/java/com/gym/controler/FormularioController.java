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
        return "/formulario/listado";
    }
    
    @GetMapping("/nuevo")
    public String formularioNuevo(Formulario categoria) {
        return "/formulario/modifica";
    }

    @PostMapping("/guardar")
    public String formularioGuardar(Formulario formulario) { 
        formularioService.save(formulario);
        return "redirect:/formulario/listado";
    }

    @GetMapping("/eliminar/{idFormulario}")
    public String formularioEliminar(Formulario formulario) {
        formularioService.delete(formulario);
        return "redirect:/formulario/listado";
    }

    @GetMapping("/modificar/{idFormulario}")
    public String formularioModificar(Formulario formulario, Model model) {
        formulario = formularioService.getFormulario(formulario);
        model.addAttribute("formulario", formulario);
        return "/formulario/modifica";
    }
    
}
