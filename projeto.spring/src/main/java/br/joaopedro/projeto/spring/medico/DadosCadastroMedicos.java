package br.joaopedro.projeto.spring.medico;

import br.joaopedro.projeto.spring.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome , String email , String crm, Especialidade especialidade,DadosEndereco endereco) {

}
