package aula07_Funcoes.exercicios;

public class Exercicio03_CalcularDobroDeUmNumero {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = dobrar(numero);
        System.out.println("O dobro de " + numero + " é: " + resultado);
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }
}