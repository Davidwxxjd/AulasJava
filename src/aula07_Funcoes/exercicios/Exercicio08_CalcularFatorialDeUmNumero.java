package aula07_Funcoes.exercicios;

public class Exercicio08_CalcularFatorialDeUmNumero {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorialIterativo(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static int calcularFatorialIterativo(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}