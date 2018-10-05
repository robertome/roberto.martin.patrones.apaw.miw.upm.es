package es.upm.miw.apaw.patrones;

import java.util.HashSet;
import java.util.Set;

public class Alumno implements Observer<Practica> {

    private String id;
    private String nombre;
    private String apellidos;
    private Set<Practica> practicas = new HashSet<>();

    public Alumno() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public void update(Practica practica) {
        practicas.add(practica);
    }

    public Set<Practica> getPracticas() {
        return practicas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    static class Builder {
        private Alumno alumno = new Alumno();

        public Builder id(String id) {
            assert id != null && !id.isEmpty();

            alumno.setId(id);
            return this;
        }

        public Builder nombre(String nombre) {
            assert nombre != null && !nombre.isEmpty();

            alumno.setNombre(nombre);
            return this;
        }

        public Builder apellidos(String apellidos) {
            assert apellidos != null && !apellidos.isEmpty();

            alumno.setApellidos(apellidos);
            return this;
        }

        public Alumno build() {
            return alumno;
        }
    }
}