package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio05_CalculoDeHorasExatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        double valorDaHoraExtra = valorHora * 1.5;

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorTotalDasHorasExtras = horasExtras * valorDaHoraExtra;

            System.out.print("O valor das horas extras a serem pagas é: R$ " + valorTotalDasHorasExtras);
        }
        scanner.close();
    }
}