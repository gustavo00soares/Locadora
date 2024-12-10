package model;

public class PessoaFisica extends Cliente {
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Pessoa Física - Nome: " + nome + " | CPF: " + documento);
    }
}