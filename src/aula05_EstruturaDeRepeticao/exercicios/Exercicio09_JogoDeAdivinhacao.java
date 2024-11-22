package aula05_EstruturaDeRepeticao.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09_JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int palpite;
        int tentativas = 0;

        System.out.println("Adivinhe o número sorteado entre 1 e 100 :D !!!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou em " + tentativas + "tentativas. Jogue novamente! :D");

        scanner.close();
    }
}