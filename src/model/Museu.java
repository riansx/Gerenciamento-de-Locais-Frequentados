package model;

public class Museu extends Local{
    private String tipoMuseu;

    public Museu(String nome, String endereco, String zona, String cidade, String estado, String pais, String tipoMuseu) {
        super(nome, endereco, zona, cidade, estado, pais);
        this.tipoMuseu = tipoMuseu;
    }

    public String getTipoMuseu() {
        return tipoMuseu;
    }
}
