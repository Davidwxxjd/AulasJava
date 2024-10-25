package aula04_EstruturaDeDecisao.exemplos;

import java.util.Scanner;

public class Exemplo05_MenuComSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção:");
        System.out.println("\t1 - para opção 1");
        System.out.println("\t2 - para opção 2");
        System.out.println("\t3 - para opção 3");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Parabéns, você escolheu a opção 1!");
                break;
            case 2:
                System.out.println("Parabéns, você escolheu a opção 2!");
                break;
            case 3:
                System.out.println("Parabéns, você escolheu a opção 3!");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        scanner.close();
    }
}
