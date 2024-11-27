package aula04_EstruturaDeDecisao.exemplos;

import java.util.Scanner;

public class Exemplo02_SemaforoElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;

        System.out.println("Digite a cor do semáforo: ");
        corSemaforo = scanner.nextLine();
        if (corSemaforo.equals("verde") || corSemaforo.equals("Verde")) {

            System.out.println("Siga");
        } else if (corSemaforo.equals("amarelo") || corSemaforo.equals("Amarelo")) {
            System.out.println("Atenção");
        } else if (corSemaforo.equals("vermelho") || corSemaforo.equals("Vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("cor inválida");
        }
        scanner.close();
    }
}