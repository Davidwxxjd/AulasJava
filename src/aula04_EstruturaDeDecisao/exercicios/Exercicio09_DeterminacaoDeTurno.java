package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio09_DeterminacaoDeTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora atual em formato de 24 horas: ");
        int hora = scanner.nextInt();

        if (hora >= 5 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Noite");
        } else if (hora >= 23 && hora < 5 && hora < 24) {
            System.out.println("Madrugada");
        }
    }
}