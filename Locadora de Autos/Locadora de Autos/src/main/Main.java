package main;

import model.*;
import service.LocadoraService;

public class Main {
    public static void main(String[] args) {
        LocadoraService locadora = new LocadoraService();

        // Cadastrar veículos
        Veiculo carro1 = new Carro("001", "Onix 2024", 120);
        Veiculo moto1 = new Moto("002", "Honda CG 150", 50);
        locadora.cadastrarVeiculo(carro1);
        locadora.cadastrarVeiculo(moto1);

        Cliente cliente1 = new PessoaFisica("João", "12345678900");
        locadora.cadastrarCliente(cliente1);

        locadora.listarVeiculosDisponiveis();

        System.out.println("\n--- Alugando Veículo 001 ---");
        locadora.alugarVeiculo("001", "12345678900");

        System.out.println("\n--- Consultar Veículo 001 ---");
        locadora.consultarVeiculo("001");

        System.out.println("\n--- Veículos Disponíveis Após Aluguel ---");
        locadora.listarVeiculosDisponiveis();

        System.out.println("\n--- Devolvendo Veículo 001 ---");
        locadora.devolverVeiculo("001");

        System.out.println("\n--- Veículos Disponíveis Após Devolução ---");
        locadora.listarVeiculosDisponiveis();
    }
}