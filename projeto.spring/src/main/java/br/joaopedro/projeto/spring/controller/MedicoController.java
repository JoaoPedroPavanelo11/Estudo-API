package br.joaopedro.projeto.spring.controller;

import br.joaopedro.projeto.spring.endereco.Endereco;
import br.joaopedro.projeto.spring.medico.DadosCadastroMedicos;
import br.joaopedro.projeto.spring.medico.Medico;
import br.joaopedro.projeto.spring.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){
        repository.save(new Medico(dados ));
    }
}
