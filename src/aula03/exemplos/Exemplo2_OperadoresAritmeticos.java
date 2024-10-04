package aula03.exemplos;

public class Exemplo2_OperadoresAritmeticos {
    public static void main(String[] args) {
        int total, num1=2, num2=4;

        total = num1 + num2;
        System.out.println("O resultado da soma é "+total);
        total = num1 - num2;
        System.out.println("O resultado da subtração é "+total);
        total = num1 * num2;
        System.out.println("O resultado da multiplicação é "+total);

        float totalFloat, numFloat1 = 2, numFloat2 =4;
        totalFloat = numFloat1 / numFloat2;
        System.out.println("O resultado da divisão é "+totalFloat);

        total = num1 % num2;
        System.out.println("o resto da divisão de" + num1 + "por" + num2+" = "+total);
    }
}
