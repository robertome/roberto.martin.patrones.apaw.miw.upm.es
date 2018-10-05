package es.upm.miw.apaw.patrones;

import java.time.LocalDateTime;

public class PracticaBuilder {

    private Practica practica = new Practica();

    public PracticaBuilder(String id, String nombre) {
        practica.setId(id);
        practica.setNombre(nombre);
        practica.setFecha(LocalDateTime.now());
    }

    public PracticaBuilder fecha(LocalDateTime fecha) {
        practica.setFecha(fecha);
        return this;
    }

    public PracticaBuilder entregada(Boolean entregada) {
        practica.setEntregada(entregada);
        return this;
    }

    public PracticaBuilder asignatura(Asignatura asignatura) {
        practica.setAsignatura(asignatura);
        return this;
    }

    public PracticaBuilder nota(Integer nota) {
        practica.setNota(nota);
        return this;
    }

    public Practica build() {
        return practica;
    }

}