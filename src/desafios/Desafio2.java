package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
        String tabela = "";
        for (String[] linha : matrizCadastro) {
            for (int coluna = 0; coluna < linha.length; coluna++) {
                tabela += linha[coluna] + "\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    public static void cadastrarUsuarios() {
        System.out.println("Quantas pessoas você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + 1][cabecalho.length];
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);

        }
        System.out.println("Preencha os dados a seguir: ");

        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + linha);
            novaMatriz[linha][0] = String.valueOf(linha);

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][1] = scanner.nextLine();
            }

        }
        matrizCadastro = novaMatriz;

    }

        public static void atualizarUsuarios() {
        }

        public static void deletarUsuarios() {
        }

    }