package aula06_MatrizesVetores.exercicios;

import java.util.Scanner;

public class Exercicio03_ContagemDeValoresBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contadorVerdadeiros = 0;

        System.out.println("Digite 8 valores booleanos (true ou false):");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextBoolean();

            if (valores[i]) {
                contadorVerdadeiros++;
            }
        }
        System.out.println("Quantidade de valores verdadeiros: " + contadorVerdadeiros);
    }
}