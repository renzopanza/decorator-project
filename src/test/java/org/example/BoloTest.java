package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoloTest {

    @Test
    void deveRetornarPrecoBoloNormal() {
        Bolo bolo = new BoloNormal(20);

        assertEquals(20, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloNormal() {
        Bolo bolo = new BoloNormal(20.0);

        assertEquals("Bolo normal", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComRecheioDeMorango() {
        Bolo bolo = new RecheioMorango(new BoloNormal(20.0));

        assertEquals(28.50, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComRecheioDeMorango() {
        Bolo bolo = new RecheioMorango(new BoloNormal(20.0));

        assertEquals("Bolo normal + Recheio de morango", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComCoberturaChocolate() {
        Bolo bolo = new CoberturaChocolate(new BoloNormal(20.0));

        assertEquals(30.0, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComCoberturaChocolate() {
        Bolo bolo = new CoberturaChocolate(new BoloNormal(20.0));

        assertEquals("Bolo normal + Cobertura de chocolate", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComFrutasPicadas() {
        Bolo bolo = new FrutasPicadas(new BoloNormal(20.0));

        assertEquals(26.50, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComFrutasPicadas() {
        Bolo bolo = new FrutasPicadas(new BoloNormal(20.0));

        assertEquals("Bolo normal + Frutas picadas", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComCoberturaChocolateMaisRecheioDeMorango() {
        Bolo bolo = new CoberturaChocolate(new RecheioMorango(new BoloNormal(20.0)));

        assertEquals(38.50, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComCoberturaChocolateMaisRecheioDeMorango() {
        Bolo bolo = new CoberturaChocolate(new RecheioMorango(new BoloNormal(20.0)));

        assertEquals("Bolo normal + Recheio de morango + Cobertura de chocolate", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComCoberturaChocolateMaisFrutasPicadas() {
        Bolo bolo = new CoberturaChocolate(new FrutasPicadas(new BoloNormal(20.0)));

        assertEquals(36.50, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComCoberturaChocolateMaisFrutasPicadas() {
        Bolo bolo = new CoberturaChocolate(new FrutasPicadas(new BoloNormal(20.0)));

        assertEquals("Bolo normal + Frutas picadas + Cobertura de chocolate", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComRecheioDeMorangoMaisFrutasPicadas() {
        Bolo bolo = new RecheioMorango(new FrutasPicadas(new BoloNormal(20.0)));

        assertEquals(35.00, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComRecheioDeMorangoMaisFrutasPicadas() {
        Bolo bolo = new RecheioMorango(new FrutasPicadas(new BoloNormal(20.0)));

        assertEquals("Bolo normal + Frutas picadas + Recheio de morango", bolo.getDescricao());
    }

    @Test
    void deveRetornarPrecoBoloComRecheioDeMorangoMaisFrutasPicadasMaisCoberturaChocolate() {
        Bolo bolo = new RecheioMorango(new FrutasPicadas(new CoberturaChocolate(new BoloNormal(20.0))));

        assertEquals(45.00, bolo.getPreco());
    }

    @Test
    void deveRetornarDescricaoBoloComRecheioDeMorangoMaisFrutasPicadasMaisCoberturaChocolate() {
        Bolo bolo = new RecheioMorango(new FrutasPicadas(new CoberturaChocolate(new BoloNormal(20.0))));

        assertEquals("Bolo normal + Cobertura de chocolate + Frutas picadas + Recheio de morango", bolo.getDescricao());
    }
}