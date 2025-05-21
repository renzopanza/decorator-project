package org.example;

public class FrutasPicadas extends BoloDecorator {
    public FrutasPicadas(Bolo bolo) {
        super(bolo);
    }

    public double getPrecoAdicional() {
        return 6.50;
    }

    public String getNomeIngrediente() {
        return "Frutas picadas";
    }
}
