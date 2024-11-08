package aula05_EstruturaDeRepeticao.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10_VerificacaoDeNumerosParesEImparesComInterrupcao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int numero;

        while (true) {
            System.out.print("Digite um número inteiro (negativo para sair): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            } else if (numero > 100) {
                break;
            } else if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        System.out.println("Números pares:");
        for (int par : pares) {
            System.out.print(par + " ");
        }
        System.out.println("Números impares:");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }
    }
}