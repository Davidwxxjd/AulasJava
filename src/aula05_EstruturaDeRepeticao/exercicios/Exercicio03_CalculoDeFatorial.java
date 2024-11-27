package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Scanner;

public class Exercicio03_CalculoDeFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, digite um número inteiro positivo.");
        } else {
            int fatorial = 1;
            int i = 1;

            do {
                fatorial *= i;
                i++;
            } while (i <= numero);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}