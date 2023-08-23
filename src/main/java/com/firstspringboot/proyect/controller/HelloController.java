package com.firstspringboot.proyect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping
    public String inicio(){
        return "Primer API!!!!!!";
    }
    
    @GetMapping("/hola")
    public String sayHello(){
        return "Hello World!";
    }
    
     @GetMapping("/chau")
    public String sayGoodBye(){
        return "Chau World!";
    }
}
