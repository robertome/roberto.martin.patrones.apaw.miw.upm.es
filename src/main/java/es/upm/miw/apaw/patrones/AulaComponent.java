package es.upm.miw.apaw.patrones;

public abstract class AulaComponent {

    public abstract void add(AulaComponent aulaComponent);

    public abstract void remove(AulaComponent aulaComponent);

    public abstract String view();

}