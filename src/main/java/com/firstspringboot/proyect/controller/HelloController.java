package com.firstspringboot.proyect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping
    public String inicio(){
        return "Primer APIIIIIIII!!!!!!";
    }
    
    @GetMapping("/hola/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Bienvenidooo " + nombre + "!!!";
    }
    
    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String describeYou(@PathVariable String nombre,
                             @PathVariable int edad,
                             @PathVariable String profesion){
        return "Hola! Me llamo " + nombre + ", tengo " + edad + " años y soy " + profesion;
    }
    
     @GetMapping("/sumar/{num1}/{num2}")
    public String sumar(@PathVariable int num1, @PathVariable int num2) {
        int suma = num1 + num2;    
        return "El resultado de la suma de " + num1 + " y " + num2 + " es: " + suma;
    }
    
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre){
        return "Bienvenidooo " + nombre + "!!!";
    }
    
     @GetMapping("/hello")
    public String presentacion(@RequestParam String nombre,
                             @RequestParam int edad,
                             @RequestParam String profesion){
        return "Hola! Me llamo " + nombre + ", tengo " + edad + " años y soy " + profesion;
    }
    
     @GetMapping("/imc")
    public String calcularIMC(@RequestParam float imc){
        String respuesta;
        
        if (imc < 1) {
            respuesta = "El valor ingresado para el IMC es incorrecto";
        } else if (imc < 18.6) {
            respuesta = "Peso insuficiente";
        } else if (imc < 25) {
            respuesta = "Peso normal";
        } else if (imc < 30) {
            respuesta = "Sobrepeso";
        } else respuesta = "Obesidad";
        
        return respuesta;
    }
    
    @GetMapping("/conversor")
    public String calcularLitros(@RequestParam double galones){
        double litros = Math.round(3.78541 * galones * 100.0) / 100.0;
        double galonesRound = (double) Math.round(galones * 100) / 100;
        return galonesRound + " galones equivalen a " + litros + " litros.";
    }
}
