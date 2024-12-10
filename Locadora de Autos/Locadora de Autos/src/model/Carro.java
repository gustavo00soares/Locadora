package model;

public class Carro extends Veiculo {
    public Carro(String codigo, String modelo, double precoDiario) {
        super(codigo, modelo, TipoVeiculo.CARRO, precoDiario);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Carro - Modelo: " + modelo + " | Código: " + codigo + " | Preço Diário: R$ " + precoDiario);
    }
}