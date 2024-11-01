package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio10_ConversaoDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDolar = 5.80;
        double valorEuro = 6.30;
        double valorLibras = 7.53;

        System.out.print("Digite o valor em reais: R$ ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão: ");
        System.out.println("1- Dolár");
        System.out.println("2- Euro");
        System.out.println("3- Libra");
        int opcao = scanner.nextInt();

        double valorConvertido;

        switch (opcao) {
            case 1:
                valorConvertido = valorReais / valorDolar;
                System.out.println("O valor em dólares é: " + valorConvertido);
                break;
            case 2:
                valorConvertido = valorReais / valorEuro;
                System.out.println("O valor em euros é: " + valorConvertido);
                break;
            case 3:
                valorConvertido = valorReais / valorLibras;
                System.out.println("O valor em libras é: " + valorConvertido);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        scanner.close();
    }
}