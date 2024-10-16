package aula04.exemplos;
import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Digite um número:");
        x = scanner.nextInt();
        if (x >= 30)
            System.out.println("número maior ou igual a 30");
        else {
            System.out.println("número menor que 30");
        }
        scanner.close();
    }
}