package br.joaopedro.projeto.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }
}
