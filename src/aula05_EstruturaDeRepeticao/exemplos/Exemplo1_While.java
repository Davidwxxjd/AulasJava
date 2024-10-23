package aula05_EstruturaDeRepeticao.exemplos;

import java.util.Scanner;

public class Exemplo1_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade =0;

        while (idade<18){
            System.out.print("Digite sua idade:");
            idade = scanner.nextInt();
            System.out.println(idade);
        }
        System.out.println("Você é maior de idade");
        scanner.close();
    }
}
