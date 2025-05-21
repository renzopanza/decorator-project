package org.example;

public class RecheioMorango extends BoloDecorator {

    public RecheioMorango(Bolo bolo) {
        super(bolo);
    }

    public double getPrecoAdicional() {
        return 8.50;
    }

    public String getNomeIngrediente() {
        return "Recheio de morango";
    }
}
