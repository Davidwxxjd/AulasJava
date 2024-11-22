package aula06_MatrizesVetores.exercicios;

import java.util.Scanner;

public class Exercicio02_BuscaDeCaracteresEmUmValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = new String[6];
        String letra;
        boolean encontrado = false;

        System.out.println("Digite 6 caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteres[i] = scanner.nextLine();
        }
        System.out.print("Digite a letra a ser procurada: ");
        letra = scanner.nextLine();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equalsIgnoreCase(letra)) {
                System.out.println("A letra ' " + letra + " ' foi encontrada na posição " + (i + 1) + ".");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("A letra ' " + letra + " ' não foi encontrada no vetor.");

            scanner.close();
        }
    }
}