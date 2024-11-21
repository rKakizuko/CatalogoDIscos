import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Disco disco = new Disco();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n----- MENU -----");
            System.out.println("1-     Adicionar artista");
            System.out.println("2-     Adicionar disco");
            System.out.println("3-     Adicionar faixa a um Disco");
            System.out.println("4-     Remover faixa de um disco");
            System.out.println("5-     Listar discos no catálogo");
            System.out.println("6-     Editar disco");
            System.out.println("7-     Remover disco");
            System.out.println("8-     Editar artista");
            System.out.println("9-     Remover artista");
            System.out.println("10-    Mostrar artistas");
            System.out.println("11-    Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do artista: ");
                    String nomeArtista = scanner.nextLine();
                    System.out.print("Digite o(s) gênero(s) do artista: ");
                    String generoArtista = scanner.nextLine();
                    Artista novoArtista = new Artista(nomeArtista, generoArtista);
                    catalogo.adicionarArtista(novoArtista);
                    System.out.println("Artista adicionado: " + novoArtista.getNome());
                    break;

                case 2:
                    System.out.print("Digite o nome do disco: ");
                    String nomeDisco = scanner.nextLine();
                    System.out.print("Digite o ano do disco: ");
                    int anoDisco = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do artista responsável: ");
                    String nomeArtistaDisco = scanner.nextLine();

                    Artista artista = catalogo.acharArtista(nomeArtistaDisco);
                    if (artista == null) {
                        System.out.println("Artista não encontrado. Adicione o artista primeiro.");
                        break;
                    }

                    Disco novoDisco = new Disco(nomeDisco, anoDisco, artista);
                    artista.adicionarDisco(novoDisco);
                    catalogo.adicionarDisco(novoDisco);
                    System.out.println("Disco adicionado: " + novoDisco.getNome());
                    break;

                case 3:
                    System.out.print("Digite o nome do disco para adicionar faixas: ");
                    String nomeDiscoBusca = scanner.nextLine();
                    Disco discoEncontrado = catalogo.acharDisco(nomeDiscoBusca);

                    if (discoEncontrado != null) {
                        System.out.print("Digite o nome da faixa a ser adicionada: ");
                        String novaFaixa = scanner.nextLine();
                        discoEncontrado.adicionarFaixa(novaFaixa);
                        System.out.println("Faixa adicionada: " + novaFaixa);
                    } else {
                        System.out.println("Disco não encontrado no catálogo.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do disco para adicionar faixas: ");
                    String discoR = scanner.nextLine();
                    Disco discoA = catalogo.acharDisco(discoR);

                    if (discoA != null) {
                        System.out.print("Digite o nome da faixa a ser removida: ");
                        String faixaR = scanner.nextLine();
                        discoA.removerFaixa(faixaR);
                        System.out.println("Faixa removida: " + faixaR);
                    } else {
                        System.out.println("Disco não encontrado no catálogo.");
                    }
                    break;

                case 5:
                    catalogo.mostrarDiscos();
                    break;

                case 6:
                    System.out.print("Digite o nome do disco a ser editado: ");
                    String discoParaEditar = scanner.nextLine();
                    Disco discoEdicao = catalogo.acharDisco(discoParaEditar);

                    if (discoEdicao != null) {
                        System.out.print("Digite o novo nome do disco: ");
                        String novoNomeDisco = scanner.nextLine();
                        discoEdicao.setNome(novoNomeDisco);
                        System.out.print("Digite o novo ano de lançamento: ");
                        int novoAnoDisco = scanner.nextInt();
                        scanner.nextLine();
                        discoEdicao.setAnoDeLancamento(novoAnoDisco);
                        System.out.println("Disco atualizado!");
                    } else {
                        System.out.println("Disco não encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Digite o nome do disco a ser removido: ");
                    String discoParaRemover = scanner.nextLine();
                    catalogo.removerDisco(discoParaRemover);
                    break;

                case 8:
                    System.out.print("Digite o nome do artista a ser editado: ");
                    String artistaParaEditar = scanner.nextLine();
                    Artista artistaEdicao = catalogo.acharArtista(artistaParaEditar);

                    if (artistaEdicao != null) {
                        System.out.print("Digite o novo nome do artista: ");
                        String novoNomeArtista = scanner.nextLine();
                        artistaEdicao.setNome(novoNomeArtista);
                        System.out.print("Digite os novos gêneros do artista: ");
                        String novosGeneros = scanner.nextLine();
                        artistaEdicao.setGeneroMusical(novosGeneros);
                        System.out.println("Artista atualizado!");
                    } else {
                        System.out.println("Artista não encontrado.");
                    }
                    break;

                case 9:
                    System.out.print("Digite o nome do artista a ser removido: ");
                    String artistaParaRemover = scanner.nextLine();
                    catalogo.removerArtista(artistaParaRemover);
                    break;

                case 10:
                    System.out.println("Todos os artistas: ");
                    catalogo.mostrarArtistas();
                    break;
                case 11:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
