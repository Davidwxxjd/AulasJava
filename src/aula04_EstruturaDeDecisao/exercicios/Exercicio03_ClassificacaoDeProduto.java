package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio03_ClassificacaoDeProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigoDoProduto = scanner.nextInt();

        String categoria;

        switch (codigoDoProduto) {
            case 1 -> categoria = "Eletrônicos";
            case 2 -> categoria = "Alimentos";
            case 3 -> categoria = "Vestuário";
            default -> categoria = "Categoria Inválida";
        }
        System.out.println("A categoria do produto é: " + categoria);

        scanner.close();
    }
}