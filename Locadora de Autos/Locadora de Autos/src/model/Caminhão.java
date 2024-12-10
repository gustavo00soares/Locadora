package model;

public class Caminhao extends Veiculo {
    public Caminhao(String codigo, String modelo, double precoDiario) {
        super(codigo, modelo, TipoVeiculo.CAMINHAO, precoDiario);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Caminhão - Modelo: " + modelo + " | Código: " + codigo + " | Preço Diário: R$ " + precoDiario);
    }
}