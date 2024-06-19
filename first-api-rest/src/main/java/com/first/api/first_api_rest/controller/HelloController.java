package com.first.api.first_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/hello")
    public String calcularMayor(){

        int x = 10;
        int y = 20;


        if(x > y){
            return "El mayor es : " + x;
        }
        else if (y > x){
            return "El mayor es : " + y;
        }
        else {
            return "son iguales";
        }
    }
}