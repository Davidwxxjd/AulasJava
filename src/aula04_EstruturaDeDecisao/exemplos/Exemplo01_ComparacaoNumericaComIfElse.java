package aula04_EstruturaDeDecisao.exemplos;

import java.util.Scanner;

public class Exemplo01_ComparacaoNumericaComIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Digite um número: ");
        x = scanner.nextInt();
        if (x >= 30)
            System.out.println("Esse número é igual ou maior que 30!");
        else {
            System.out.println("Esse número é menor que 30!");
        }
        scanner.close();
    }
}