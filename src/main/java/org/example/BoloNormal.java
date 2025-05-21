package org.example;

public class BoloNormal implements Bolo {

    private double preco;

    public BoloNormal() {
    }

    public BoloNormal(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Bolo normal";
    }
}