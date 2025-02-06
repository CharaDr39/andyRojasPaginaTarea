package tarea2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/caracteristicas")
    public String caracteristicas() {
        return "caracteristicas"; 
    }

    @GetMapping("/galeria")
    public String galeria() {
        return "galeria";
    }

    @GetMapping("/logros")
    public String logros() {
        return "logros";
    }
}
