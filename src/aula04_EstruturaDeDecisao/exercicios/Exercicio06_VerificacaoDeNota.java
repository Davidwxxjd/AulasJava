package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio06_VerificacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado :D");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação ;(");
        } else {
            System.out.println("Reprovado :(");
        }
        scanner.close();
    }
}