package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Scanner;

public class Exercicio05_MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a ordem das notas" + i);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 5;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}