package desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }
        } while (opcao!=5);
    }

    public static void exibirUsuarios() {
        System.out.println("exibirUsuarios");
    }

    public static void cadastrarUsuarios() {
        System.out.println("cadastrarUsuarios");
    }

    public static void atualizarUsuarios() {
        System.out.println("atualizarUsuarios");
    }

    public static void deletarUsuarios() {
        System.out.println("deletarUsuarios");

    }
}