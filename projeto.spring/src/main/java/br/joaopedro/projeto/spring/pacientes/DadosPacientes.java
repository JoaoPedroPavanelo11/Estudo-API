package br.joaopedro.projeto.spring.pacientes;

import br.joaopedro.projeto.spring.endereco.DadosEndereco;

public record DadosPacientes(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
