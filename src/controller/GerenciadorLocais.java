package controller;

import java.util.ArrayList;

import model.Avaliacao;
import model.Local;

public class GerenciadorLocais {
    private ArrayList<Local> locais = new ArrayList<>();

    public void adicionarLocal(Local local){
        locais.add(local);
    }

    public void listarLocais(){
        for(Local local : locais){
            System.out.println(local);
        }
    }

    public boolean editarLocal(int i, String novoEndereco){
        if (i >= 0 && i < locais.size()){
            locais.get(i).setEndereco(novoEndereco);
            return true;
        }
        return false;
    }

    public boolean removerLocal(int i) {
        if (i >= 0 && i < locais.size()) {
            locais.remove(i);
            return true;
        }
        return false;
    }

    public void mostrarAvaliacoesDoLocal(int i) {
        Local local = locais.get(i);
        System.out.println("Avaliações do local: " + local.getNome());

        for (Avaliacao a : local.getAvaliacoes()) {
            System.out.println("Nota: " + a.getNota() + " - Comentário: " + a.getComentario());
        }

        System.out.println("Média das notas: " + local.calcularMedia());
    }

    public Local getLocal(int indiceAvaliar) {
        return locais.get(indiceAvaliar);
    }
}
