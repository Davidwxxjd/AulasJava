package aula07_Funcoes.exercicios;

public class Exercicio07_DeterminarOMaiorDeTresNumeros {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int num3 = 10;

        int maior = maiorNumero(num1, num2, num3);
        System.out.println("O maior número é: " + maior);
    }

    public static int maiorNumero(int a, int b, int c) {
        int maior = a; // Inicializamos com o primeiro número

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior;
    }
}