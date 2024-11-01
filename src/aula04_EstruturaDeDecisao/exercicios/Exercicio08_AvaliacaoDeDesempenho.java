package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio08_AvaliacaoDeDesempenho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a avaliação de desempenho do funcionário (1 a 5): ");
        int avaliacao = scanner.nextInt();

        switch (avaliacao) {
            case 1:
                System.out.println("Precisa melhorar :(");
                break;
            case 2:
                System.out.println("Abaixo da média ;(");
                break;
            case 3:
                System.out.println("Média :]");
                break;
            case 4:
                System.out.println("Acima da média :)");
                break;
            case 5:
                System.out.println("Excelente :D");
                break;
            default:
                System.out.println("Avaliação Inválida! Por favor, utilize um número de 1 a 5");
        }
        scanner.close();
    }
}