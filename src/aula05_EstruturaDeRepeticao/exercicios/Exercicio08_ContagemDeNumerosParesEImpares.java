package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Scanner;

public class Exercicio08_ContagemDeNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);

        scanner.close();
    }
}