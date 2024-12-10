package model;

public class PessoaJuridica extends Cliente {
    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Pessoa Jurídica - Nome: " + nome + " | CNPJ: " + documento);
    }
}