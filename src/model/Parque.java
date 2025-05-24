package model;

public class Parque extends Local{

    private String tipoParque;

    public Parque(String nome, String endereco, String zona, String cidade, String estado, String pais, String tipoParque) {
        super(nome, endereco, zona, cidade, estado, pais);
        this.tipoParque = tipoParque;
    }

    public String getTipoParque() {
        return tipoParque;
    }
}
