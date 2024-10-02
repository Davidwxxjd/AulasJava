package aula03.exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int total, num1=2, num2=4;

        total = num1 + num2;
        System.out.println("O total da soma é "+total);
        total = num1 - num2;
        System.out.println("O total da subtração é "+total);
        total = num1 * num2;
        System.out.println("O total da multiplicação é "+total);

        float totalFloat, numFloat1 = 2, numFloat2 =4;
        totalFloat = numFloat1 / numFloat2;
        System.out.println("O total da divisão é "+totalFloat);
    }
}
