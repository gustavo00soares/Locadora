package model;

import java.time.LocalDate;

public class Aluguel {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataInicio;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    private double valorTotal;

    public Aluguel(Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataDevolucaoPrevista) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public void finalizarAluguel(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
        long diasAlugados = java.time.temporal.ChronoUnit.DAYS.between(dataInicio, dataDevolucaoReal);
        long diasAtraso = Math.max(0, java.time.temporal.ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucaoReal));

        valorTotal = diasAlugados * veiculo.precoDiario;
        if (diasAtraso > 0) {
            double multa = diasAtraso * veiculo.precoDiario * 0.1;
            valorTotal += multa;
        }
    }
}