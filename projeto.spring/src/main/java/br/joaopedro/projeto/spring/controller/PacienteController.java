package br.joaopedro.projeto.spring.controller;

import br.joaopedro.projeto.spring.pacientes.DadosPacientes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastro(@RequestBody DadosPacientes dadosPacientes){
        System.out.println("Dados: "+dadosPacientes);
    }
}
