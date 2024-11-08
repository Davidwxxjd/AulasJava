package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Scanner;

public class Exercicio07_ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 a 10: ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
    }
}