package aula04_EstruturaDeDecisao.exercicios;

import java.util.Scanner;

public class Exercicio01_VerificacaoDeAcessoAoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso negado. Você precisa ter 18 anos ou mais para visualizar este conteúdo!");
        }
        scanner.close();
    }
}