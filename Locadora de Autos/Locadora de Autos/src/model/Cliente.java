package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected String nome;
    protected String documento;
    protected List<Aluguel> historico;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
        this.historico = new ArrayList<>();
    }

    public abstract void mostrarInformacoes();
}