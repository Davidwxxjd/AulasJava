package desafios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro = {{"", ""}};
    static File arquivoBancoDeDados = new File(System.getProperty("user.home"), "Desafio3"+File.separator+"bancoDeDados.txt");


    public static void main(String[] args) {
        carregarDadosDoArquivo();
        matrizCadastro[0] = cabecalho;

        String menu = """
                _________________________________________
                |   Escolha uma opção:                  |
                        1 - Exibir Cadastro Completo    |
                        2 - Cadastrar Usuario           |
                        3 - Atualizar Usuario           |
                        4 - Deletar Usuario             |
                        5 - Sair                        |
                ________________________________________|
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Fim de Programa!!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuarios() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < linhas.length; colunas++) {
                int tamanhoColuna = colunas == 0 ? 5 : (colunas == 2 ? 10 : 25);
                tabela.append(String.format("%-" + tamanhoColuna + "s|", linhas[colunas]));

            }
            tabela.append("\n");
        }
        System.out.println(tabela);
    }

    public static void cadastrarUsuarios() {
        System.out.println("Quantas pessoas você deseja cadastrar: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + quantidadePessoas][cabecalho.length];
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);

        }
        System.out.println("Preencha os dados a seguir: ");

        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + linha);
            novaMatriz[linha][0] = String.valueOf(linha);

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }

        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    public static void atualizarUsuarios() {
        exibirUsuarios();

        System.out.println("\nDigite o ID do usuário que deseja atualizar:");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Atualize as informações a seguir: ");

        System.out.println(cabecalho[0] + " - " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ":  ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuarios();
    }

    public static void deletarUsuarios() {
        exibirUsuarios();
        System.out.println("\nDigite o Id do usuário que deseja deletar o registro: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length - 1][cabecalho.length];
        novaMatriz[0] = cabecalho;
        for (int linha = 1, idNovaMatriz = 1; linha < matrizCadastro.length; linha++) {
            if (linha == idEscolhido) {
                continue;

            }
            novaMatriz[idNovaMatriz] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso! :D");
        exibirUsuarios();
        salvarDadosNoArquivo();
    }

    public static void salvarDadosNoArquivo() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""));
            for (String[] linha : matrizCadastro) {
                bufferedWriter.write(String.join(",", linha) + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void carregarDadosDoArquivo() {
        if(!arquivoBancoDeDados.exists()) {
            try {
                if (arquivoBancoDeDados.createNewFile()){
                    System.out.println("Arquivo"+arquivoBancoDeDados.getName()+"criado com sucesso!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(""))) {

            String linha;
            StringBuilder conteudoArquivo = new StringBuilder();

            while ((linha = bufferedReader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    conteudoArquivo.append(linha).append("\n");
                }
            }

            String [] linhaDadosUsuario = conteudoArquivo.toString().split("\n");

            matrizCadastro = new String[linhaDadosUsuario.length][cabecalho.length];
            for (int i = 0; i < linhaDadosUsuario.length; i++) {
                matrizCadastro[i] = linhaDadosUsuario[i].split(",");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}