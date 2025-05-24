package model;

public class Outro extends Local {

    private String tipoLocal;

    public Outro(String nome, String endereco, String zona, String cidade, String estado, String pais, String tipoLocal) {
        super(nome, endereco, zona, cidade, estado, pais);
        this.tipoLocal = tipoLocal;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }
}
