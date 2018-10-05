package es.upm.miw.apaw.patrones;

public class Aula {

    private String id;
    private Integer bloque;
    private Integer numero;

    public Aula() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBloque() {
        return bloque;
    }

    public void setBloque(Integer bloque) {
        this.bloque = bloque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    static class Builder {
        private Aula aula = new Aula();

        public Builder id(String id) {
            assert id != null && !id.isEmpty();

            aula.setId(id);
            return this;
        }

        public Builder bloque(Integer bloque) {
            assert bloque != null;

            aula.setBloque(bloque);
            return this;
        }

        public Builder numero(Integer numero) {
            assert numero != null;

            aula.setNumero(numero);
            return this;
        }

        public Aula build() {
            return aula;
        }
    }

}