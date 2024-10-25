package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio02_DescontoEmCompra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;
        if (valorCompra > 100) {
            desconto = valorCompra * 0.1;
        }

        double valorFinal = valorCompra - desconto;

        System.out.printf("O valor final a ser pago é: R$ %.2f", valorFinal);

        scanner.close();
    }
}