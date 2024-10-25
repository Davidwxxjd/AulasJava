package aula02_Variaveis.exemplos;

import java.util.Scanner;

public class Exemplo07_String {
    public static void main(String[] args) {
        String texto = "este texto está na primeira linha\nEste texto está na segunda linha" +
                " e continua nessa linha\n\tEste texto está na terceira linha eespaçado com tabulação";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é " + nome + " e tem " + idade + " anos");

    }
}
