package es.upm.miw.apaw.patrones;

import java.util.HashMap;
import java.util.Map;

public class PracticaFactory extends Observable {

    private static PracticaFactory factory;
    private Map<String, Practica> practicas;

    private PracticaFactory() {
        practicas = new HashMap<String, Practica>();
    }

    public static PracticaFactory getFactory() {
        if (factory == null) {
            factory = new PracticaFactory();
        }

        return factory;
    }

    public Practica getPractica(String id) {
        assert id != null;

        return practicas.get(id);
    }

    public void removePractica(String id) {
        assert id != null;

        practicas.remove(id);
    }

    public void addPractica(Practica practica) {
        assert practica != null;
        assert practica.getId() != null;

        practicas.put(practica.getId(), practica);
    }

}