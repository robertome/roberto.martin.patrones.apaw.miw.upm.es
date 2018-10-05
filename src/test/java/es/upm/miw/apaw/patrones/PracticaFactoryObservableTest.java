package es.upm.miw.apaw.patrones;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PracticaFactoryObservableTest {

    private Practica practica = new PracticaBuilder("ID1", "Patrones de Diseño").asignatura(Asignatura.APAW).fecha(LocalDateTime.now()).build();
    private Alumno alumno = Alumno.builder().id("RME").nombre("Roberto").apellidos("Martin Escribano").build();

    @Test
    void testAddObserver() {
        PracticaFactory factory = PracticaFactory.getFactory();
        factory.addObserver(alumno);

        factory.addPractica(practica);

        assertTrue(alumno.getPracticas().contains(practica));
    }

    @Test
    void testRemoveObserver() {
        PracticaFactory factory = PracticaFactory.getFactory();
        factory.addObserver(alumno);
        factory.removeObserver(alumno);

        factory.addPractica(practica);

        assertFalse(alumno.getPracticas().contains(practica));
    }

}
