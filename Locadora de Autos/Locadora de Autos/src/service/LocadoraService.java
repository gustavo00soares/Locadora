package service;

import model.*;
import util.OperacoesLocadora;

import java.util.ArrayList;
import java.util.List;

public class LocadoraService implements OperacoesLocadora {
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void alugarVeiculo(String codigoVeiculo, String cpfCliente) {
        Veiculo veiculo = buscarVeiculo(codigoVeiculo);
        Cliente cliente = buscarCliente(cpfCliente);
        if (veiculo != null && veiculo.getStatus() == StatusVeiculo.DISPONIVEL && cliente != null) {
            veiculo.setStatus(StatusVeiculo.ALUGADO);
            System.out.println("Veículo " + veiculo.getCodigo() + " foi alugado para o cliente " + cliente.nome);
        } else {
            System.out.println("Não foi possível realizar o aluguel. Veículo ou cliente não encontrado.");
        }
    }

    @Override
    public void devolverVeiculo(String codigoVeiculo) {
        Veiculo veiculo = buscarVeiculo(codigoVeiculo);
        if (veiculo != null && veiculo.getStatus() == StatusVeiculo.ALUGADO) {
            veiculo.setStatus(StatusVeiculo.DISPONIVEL);
            System.out.println("Veículo " + veiculo.getCodigo() + " foi devolvido com sucesso.");
        } else {
            System.out.println("Erro: O veículo não está alugado ou não foi encontrado.");
        }
    }

    @Override
    public void listarVeiculosDisponiveis() {
        System.out.println("Veículos disponíveis para aluguel:");
        veiculos.stream()
                .filter(veiculo -> veiculo.getStatus() == StatusVeiculo.DISPONIVEL)
                .forEach(Veiculo::mostrarInformacoes);
    }

    @Override
    public void consultarVeiculo(String codigoVeiculo) {
        Veiculo veiculo = buscarVeiculo(codigoVeiculo);
        if (veiculo != null) {
            veiculo.mostrarInformacoes();
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private Veiculo buscarVeiculo(String codigo) {
        return veiculos.stream()
                .filter(veiculo -> veiculo.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    private Cliente buscarCliente(String cpf) {
        return clientes.stream()
                .filter(cliente -> cliente.documento.equals(cpf))
                .findFirst()
                .orElse(null);
    }
}