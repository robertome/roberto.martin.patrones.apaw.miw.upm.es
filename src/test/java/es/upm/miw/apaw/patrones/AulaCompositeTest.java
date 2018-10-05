package es.upm.miw.apaw.patrones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AulaCompositeTest {


    private AulaLeaf aulaLeafA1;
    private AulaLeaf aulaLeafB1;
    private AulaLeaf aulaLeafB2;
    private AulaComposite edificio;
    private AulaComposite bloqueA;
    private AulaComposite bloqueB;

    AulaCompositeTest() {
        aulaLeafA1 = new AulaLeaf(Aula.builder().id("AulaA1").bloque(1).numero(1).build());
        bloqueA = new AulaComposite("BloqueA");
        bloqueA.add(aulaLeafA1);

        aulaLeafB1 = new AulaLeaf(Aula.builder().id("AulaB1").bloque(2).numero(1).build());
        aulaLeafB2 = new AulaLeaf(Aula.builder().id("AulaB2").bloque(2).numero(2).build());
        bloqueB = new AulaComposite("BloqueB");
        bloqueB.add(aulaLeafB1);
        bloqueB.add(aulaLeafB2);

        edificio = new AulaComposite("Edificio");
        edificio.add(bloqueA);
        edificio.add(bloqueB);
    }

    @Test
    void testViewIfLeaf() {
        assertEquals("AulaA1", aulaLeafA1.view());
    }

    @Test
    void testViewIfComposite() {
        assertEquals("BloqueA", bloqueA.view());
    }

}
