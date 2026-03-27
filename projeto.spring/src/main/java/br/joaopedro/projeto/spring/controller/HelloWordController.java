package br.joaopedro.projeto.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @GetMapping
    public String olaMundo(){
        return "Hello Word ou ola mundo";
    }
}
