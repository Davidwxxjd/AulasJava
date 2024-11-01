package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio07_EscolhaDeOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("Resultado da divisão: " + resultado);
                break;
            default:
                System.out.println("Opção Inválida! ");
        }
        scanner.close();
    }
}