package aula06_MatrizesVetores.exercicios;

import java.util.Scanner;

public class Exercicio05_VetorDeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Alex", "Galeno", "Wells"};
        String nomeProcurado;
        boolean encontrado = false;

        System.out.print("Digite o nome que deseja procurar: ");
        nomeProcurado = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome " + nomeProcurado + " foi encontrado no vetor.");
        } else {
            System.out.println("O nome " + nomeProcurado + " não foi encontrado no vetor.");

            scanner.close();
        }
    }
}