package org.example;

public class CoberturaChocolate extends BoloDecorator {

    public CoberturaChocolate(Bolo bolo){
        super(bolo);
    }

    public double getPrecoAdicional() {
        return 10.00;
    }

    public String getNomeIngrediente() {
        return "Cobertura de chocolate";
    }
}