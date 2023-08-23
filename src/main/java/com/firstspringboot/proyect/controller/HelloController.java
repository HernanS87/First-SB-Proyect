package com.firstspringboot.proyect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping
    public String inicio(){
        return "Primer API!!!!!!";
    }
    
    @GetMapping("/hola/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Bienvenidooo " + nombre + "!!!";
    }
    
     @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String sayGoodBye(@PathVariable String nombre,
                             @PathVariable int edad,
                             @PathVariable String profesion){
        return "Hola! Me llamo " + nombre + ", tengo " + edad + " años y soy " + profesion;
    }
}
