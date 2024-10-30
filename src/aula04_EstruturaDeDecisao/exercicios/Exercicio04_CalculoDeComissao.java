package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio04_CalculoDeComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorDasVendas = scanner.nextDouble();

        double comissao;

        if (valorDasVendas < 1000) {
            comissao = valorDasVendas * 0.05;
        } else if (valorDasVendas >= 1000 && valorDasVendas <= 5000) {
            comissao = valorDasVendas * 0.1;
        } else {
            comissao = valorDasVendas * 0.15;
        }
        System.out.println("O valor da comissão é: R$ " + comissao);

        scanner.close();
    }
}