package es.upm.miw.apaw.patrones;

public class AulaLeaf extends AulaComponent {

    private Aula aula;

    public AulaLeaf(Aula aula) {
        assert aula != null;

        this.aula = aula;
    }

    public void add(AulaComponent aulaComponent) {
        // Es una hoja, no implementa el metodo abstracto
    }

    public void remove(AulaComponent aulaComponent) {
        // Es una hoja, no implementa el metodo abstracto
    }

    public String view() {
        return aula.getId();
    }

}