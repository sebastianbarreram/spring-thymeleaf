package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Mensaje con Thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        return "index";
    }
}
