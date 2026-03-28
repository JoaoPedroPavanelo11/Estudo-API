package br.joaopedro.projeto.spring.controller;

import br.joaopedro.projeto.spring.medico.DadosCadastroMedicos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){
        System.out.println(dados);
    }
}
