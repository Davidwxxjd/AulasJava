package aula06_MatrizesVetores.exercicios;

import java.util.Scanner;

public class Exercicio04_MediaDeNotasDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite as 4 notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota" + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}