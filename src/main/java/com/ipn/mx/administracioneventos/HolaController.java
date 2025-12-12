package com.ipn.mx.administracioneventos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String home() {
        return "Aplicación Spring Boot desplegada en Render ✔";
    }
}
