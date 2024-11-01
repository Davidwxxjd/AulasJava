package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Scanner;

public class Exercicio04_VerificacaoDeNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean Primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    Primo = false;
                    break;
                }
            }
            if (Primo) {
                System.out.println(numero + " é um número primo");
            } else {
                System.out.println(numero + " não é um número primo");
            }
        }
        scanner.close();
    }
}