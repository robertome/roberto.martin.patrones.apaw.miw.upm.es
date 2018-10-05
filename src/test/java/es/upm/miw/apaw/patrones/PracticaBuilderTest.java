package es.upm.miw.apaw.patrones;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PracticaBuilderTest {

    @Test
    void testUsoCompleto() {
        LocalDateTime now = LocalDateTime.now();
        Practica practica = new PracticaBuilder("1", "Patrones de Diseño").asignatura(Asignatura.APAW).fecha(now).entregada(true).nota(8).build();

        assertEquals("1", practica.getId());
        assertEquals("Patrones de Diseño", practica.getNombre());
        assertEquals(Asignatura.APAW, practica.getAsignatura());
        assertEquals(now, practica.getFecha());
        assertTrue(practica.isEntregada());
        assertEquals(8, practica.getNota().intValue());
    }

    @Test
    void testUsoParcial() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 10, 16, 18, 0, 0);
        Practica practica = new PracticaBuilder("3", "Practica 1").asignatura(Asignatura.FEM).fecha(localDateTime).build();

        assertEquals("3", practica.getId());
        assertEquals("Practica 1", practica.getNombre());
        assertEquals(Asignatura.FEM, practica.getAsignatura());
        assertNotEquals(LocalDateTime.now(), practica.getFecha());
        assertFalse(practica.isEntregada());
        assertNull(practica.getNota());
    }

}
