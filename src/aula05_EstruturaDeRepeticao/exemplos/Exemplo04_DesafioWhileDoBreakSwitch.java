package aula05_EstruturaDeRepeticao.exemplos;

import java.util.Scanner;

public class Exemplo04_DesafioWhileDoBreakSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("Escolha uma opção:");

            System.out.println("\t1 - para a opção 1");
            System.out.println("\t2 - para a opção 2");
            System.out.println("\t3 - para a opção 3");
            System.out.println("\t4 - sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Parabéns! Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Parabéns! Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Parabéns! Você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

