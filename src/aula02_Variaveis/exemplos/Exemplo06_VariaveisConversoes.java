package aula02_Variaveis.exemplos;

import java.util.Scanner;

public class Exemplo06_VariaveisConversoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número inteiro:");
        int varInt = scanner.nextInt();
        System.out.println("Você digitou o número: " + varInt);
        short varShort = (short) varInt;
        System.out.println("varShort = " + varShort);
        byte varByte = (byte) varShort;
        System.out.println("varByte = " + varByte);

        System.out.println("digite um número decimal:");
        double varDouble = scanner.nextDouble();

        System.out.println("Você digitou o número: " + varDouble);
        float varFloat = (float) varDouble;
        System.out.println("varFloat = " + varFloat);

        varInt = (int) varFloat;
        System.out.println("varInt = " + varInt);

        scanner.close();
    }
}