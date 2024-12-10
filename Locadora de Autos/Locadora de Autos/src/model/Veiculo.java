package model;

public abstract class Veiculo {
    protected String codigo;
    protected String modelo;
    protected TipoVeiculo tipo;
    protected StatusVeiculo status;
    protected double precoDiario;

    public Veiculo(String codigo, String modelo, TipoVeiculo tipo, double precoDiario) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.tipo = tipo;
        this.status = StatusVeiculo.DISPONIVEL;
        this.precoDiario = precoDiario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public abstract void mostrarInformacoes();
}