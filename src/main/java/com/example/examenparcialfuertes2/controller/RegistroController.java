
package com.example.examenparcialfuertes2.controller;

import com.example.examenparcialfuertes2.model.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
/**
 *
 * @author BETZABET
 */

@Controller
public class RegistroController {
     @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new Registro());
        return "registro";
    }

    @PostMapping("/registro")
    public String procesarRegistro(@ModelAttribute Registro registro, Model model) {
        
        return "exito";  
    }
    
    @Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index"; 
    }
    }
}
