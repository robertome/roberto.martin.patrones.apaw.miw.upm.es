package es.upm.miw.apaw.patrones;

public abstract class AulaComponent {

    private String name;

    public AulaComponent() {
    }

    public void AulaComponent(String name) {
        // TODO implement here
    }

    public abstract void add(AulaComponent aulaComponent);

    public abstract void remove(AulaComponent aulaComponent);

    public abstract void view();

}