package model;

public class Restaurante extends Local{
    private String tipoRestaurante;

    public Restaurante(String nome, String endereco, String zona, String cidade, String estado, String pais, String tipoRestaurante) {
        super(nome, endereco, zona, cidade, estado, pais);
        this.tipoRestaurante = tipoRestaurante;
    }

    public String getTipoRestaurante() {
        return tipoRestaurante;
    }
}
