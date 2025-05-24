package model;


import java.util.ArrayList;
import java.util.List;

public class Local {

    private String  nome;
    private String endereco;
    private String zona;
    private String cidade;
    private String estado;
    private String pais;
    private List<Avaliacao> avaliacoes;

    public Local(String nome, String endereco, String zona, String cidade, String estado, String pais) {
        this.nome = nome;
        this.endereco = endereco;
        this.zona = zona;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.avaliacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }


    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public double calcularMedia() {
        if (avaliacoes.isEmpty()) return 0;

        int soma = 0;
        for (Avaliacao a : avaliacoes) {
            soma += a.getNota();
        }
        return (double) soma / avaliacoes.size();
    }

    @Override
    public String toString() {
        return nome + " - " + endereco + ", " + cidade + "/" + estado + ", " + pais;
    }

}
