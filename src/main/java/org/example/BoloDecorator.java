package org.example;

public abstract class BoloDecorator implements Bolo {

    private Bolo bolo;
    public String ingredientes;

    public BoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }

    public Bolo getBolo() {
        return bolo;
    }

    public void setBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    public abstract double getPrecoAdicional();

    public double getPreco() {
        return this.bolo.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getNomeIngrediente();

    public String getDescricao() {
        return this.bolo.getDescricao() + " + " + this.getNomeIngrediente();
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
