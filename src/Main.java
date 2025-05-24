import controller.GerenciadorLocais;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorLocais gerenciador = new GerenciadorLocais();

        while (true) {
            System.out.println("\nEscolha a opção desejada: ");
            System.out.println("1 - Adicionar um local");
            System.out.println("2 - Remover um local");
            System.out.println("3 - Listar locais");
            System.out.println("4 - Mostrar avaliações");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de local deseja adicionar?");
                    System.out.println("1 - Museu");
                    System.out.println("2 - Restaurante");
                    System.out.println("3 - Parque");
                    System.out.println("4 - Outro");

                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Zona: ");
                    String zona = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();

                    Local local;

                    switch (tipo) {
                        case 1:
                            System.out.print("Tipo de museu: ");
                            String tipoMuseu = scanner.nextLine();
                            local = new Museu(nome, endereco, zona, cidade, estado, pais, tipoMuseu);
                            break;
                        case 2:
                            System.out.print("Tipo de restaurante: ");
                            String tipoRestaurante = scanner.nextLine();
                            local = new Restaurante(nome, endereco, zona, cidade, estado, pais, tipoRestaurante);
                            break;
                        case 3:
                            System.out.print("Tipo de parque: ");
                            String tipoParque = scanner.nextLine();
                            local = new Parque(nome, endereco, zona, cidade, estado, pais, tipoParque);
                            break;
                        case 4:
                            System.out.print("Tipo de local: ");
                            String tipoLocal = scanner.nextLine();
                            local = new Outro(nome, endereco, zona, cidade, estado, pais, tipoLocal);
                            break;
                        default:
                            System.out.println("Opção inválida, local não criado.");
                            local = null;
                    }

                    if (local != null) {

                        System.out.print("Nota da avaliação (1-5): ");
                        int nota = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Comentário: ");
                        String comentario = scanner.nextLine();

                        Avaliacao avaliacao = new Avaliacao();
                        avaliacao.setNota(nota);
                        avaliacao.setComentario(comentario);

                        local.adicionarAvaliacao(avaliacao);

                        gerenciador.adicionarLocal(local);
                        System.out.println("Local cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("Informe o índice do local que deseja remover:");
                    gerenciador.listarLocais();
                    int indiceRemover = scanner.nextInt();
                    if (gerenciador.removerLocal(indiceRemover)) {
                        System.out.println("Local removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Locais cadastrados:");
                    gerenciador.listarLocais();
                    break;

                case 4:
                    System.out.println("Informe o índice do local para ver avaliações:");
                    gerenciador.listarLocais();
                    int indiceMostrar = scanner.nextInt();
                    if (indiceMostrar >= 0) {
                        gerenciador.mostrarAvaliacoesDoLocal(indiceMostrar);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
