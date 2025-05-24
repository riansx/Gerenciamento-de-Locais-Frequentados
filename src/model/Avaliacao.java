package model;

public class Avaliacao {


    private int nota;
    private String comentario;


    public String getComentario() {
        return comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setNota(int nota) {
        if(nota >= 1 && nota <= 5) {
            this.nota = nota;
        } else {
            System.out.println("A nota deve estar entre 1 e 5");
        }

    }


}
