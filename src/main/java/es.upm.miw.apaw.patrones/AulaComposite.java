package es.upm.miw.apaw.patrones;

import java.util.List;

public class AulaComposite extends AulaComponent {

    private List<AulaComponent> aulaComponentList;

    public AulaComposite() {
    }

    public void AulaComposite(String name) {
        // TODO implement here
    }

    public void add(AulaComponent aulaComponent) {
        // TODO implement here
    }

    public void remove(AulaComponent aulaComponent) {
        // TODO implement here
    }

    public void view() {
        // TODO implement here
    }

    public abstract void add(AulaComponent aulaComponent);

    public abstract void remove(AulaComponent aulaComponent);

    public abstract void view();

}