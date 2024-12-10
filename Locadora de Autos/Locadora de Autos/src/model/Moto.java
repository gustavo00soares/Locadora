package model;

public class Moto extends Veiculo {
    public Moto(String codigo, String modelo, double precoDiario) {
        super(codigo, modelo, TipoVeiculo.MOTO, precoDiario);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Moto - Modelo: " + modelo + " | Código: " + codigo + " | Preço Diário: R$ " + precoDiario);
    }
}