package aula03.exemplos;
import java.util.Scanner;
public class Exemplos5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
         int numero = scanner.nextInt();
         long varLong = numero;
         float varfloat = numero;
         double vardouble = numero;

         System.out.println("O número que você digitou é: "+numero);
        System.out.println("varLong = "+varLong);
        System.out.println("varFloat = "+varfloat);
        System.out.println("vardouble = "+vardouble);

        System.out.println("Digite um número decimal");
        varfloat = scanner.nextFloat();
        System.out.println("O número que você digitou é: "+varfloat);

        vardouble = varfloat;
        System.out.println("vardouble = "+vardouble);



    }
}
