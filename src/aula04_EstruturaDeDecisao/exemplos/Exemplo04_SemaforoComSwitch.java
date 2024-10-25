package aula04_EstruturaDeDecisao.exemplos;

import java.util.Scanner;

public class Exemplo04_SemaforoComSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;
        System.out.println("Digite a cor do semáforo");
        corSemaforo = scanner.nextLine();

        switch (corSemaforo) {
            case "verde", "Verde":
                System.out.println("Siga!");
                break;

            case "amarelo", "Amarelo":
                System.out.println("Atenção!");
                break;

            case "vermelho", "Vermelho":
                System.out.println("Pare!");
                break;
            default:
                System.out.println("Nunca vi semáforo desta cor");
        }
        scanner.close();
    }
}
