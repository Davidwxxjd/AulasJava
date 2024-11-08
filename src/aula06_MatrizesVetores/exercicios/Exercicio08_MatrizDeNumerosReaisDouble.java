package aula06_MatrizesVetores.exercicios;

import java.util.Scanner;

public class Exercicio08_MatrizDeNumerosReaisDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        System.out.println("Digite os valores para a matriz de 2x2:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("A soma da linha " + (i + 1) + " é: " + somaLinha);
        }
    }
}