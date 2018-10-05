package es.upm.miw.apaw.patrones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PracticaFactoryTest {

    private static final String ID1 = "APAW";
    private static final String ID2 = "FEM";
    private Practica practicaAPAW = new PracticaBuilder(ID1, "Patrones de Diseño").asignatura(Asignatura.APAW).fecha(LocalDateTime.now()).entregada(true).nota(8).build();
    private Practica practicaFEM = new PracticaBuilder(ID2, "Practica 1").asignatura(Asignatura.FEM).fecha(LocalDateTime.now()).build();

    @BeforeEach
    void init() {
        PracticaFactory factory = PracticaFactory.getFactory();
        factory.clear();

        factory.addPractica(practicaAPAW);
        factory.addPractica(practicaFEM);
    }

    @Test
    void testIsSingleton() {
        assertSame(PracticaFactory.getFactory(), PracticaFactory.getFactory());
    }

    @Test
    void testSingletonNotNull() {
        assertNotNull(PracticaFactory.getFactory());
    }

    @Test
    void testGetPractica() {
        PracticaFactory factory = PracticaFactory.getFactory();
        factory.addPractica(practicaAPAW);
        factory.addPractica(practicaFEM);

        assertEquals(practicaAPAW, factory.getPractica(ID1));
        assertEquals(practicaFEM, factory.getPractica(ID2));
    }

    @Test
    void testRemovePractica() {
        PracticaFactory factory = PracticaFactory.getFactory();
        assertEquals(practicaAPAW, factory.getPractica(ID1));

        factory.removePractica(ID1);
        assertNull(factory.getPractica(ID1));
    }

}
