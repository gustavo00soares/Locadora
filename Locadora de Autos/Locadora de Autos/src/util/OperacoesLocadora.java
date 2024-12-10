package util;

public interface OperacoesLocadora {
    void alugarVeiculo(String codigoVeiculo, String cpfCliente);
    void devolverVeiculo(String codigoVeiculo);
    void listarVeiculosDisponiveis();
    void consultarVeiculo(String codigoVeiculo);
}