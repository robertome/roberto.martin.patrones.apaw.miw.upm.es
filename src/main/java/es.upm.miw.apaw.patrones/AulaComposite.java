package es.upm.miw.apaw.patrones;

import java.util.ArrayList;
import java.util.List;

public class AulaComposite extends AulaComponent {

    private List<AulaComponent> aulaComponentList;
    private String name;

    public AulaComposite(String name) {
        this.name = name;
        aulaComponentList = new ArrayList<AulaComponent>();
    }

    public void add(AulaComponent aulaComponent) {
        assert aulaComponent != null;

        aulaComponentList.add(aulaComponent);
    }

    public void remove(AulaComponent aulaComponent) {
        assert aulaComponent != null;

        aulaComponentList.remove(aulaComponent);
    }

    public String view() {
        return name;
    }

}