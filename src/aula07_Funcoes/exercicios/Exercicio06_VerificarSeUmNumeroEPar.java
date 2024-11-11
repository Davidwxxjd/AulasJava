package aula07_Funcoes.exercicios;

public class Exercicio06_VerificarSeUmNumeroEPar {
    public static void main(String[] args) {
        int numero = 10;
        boolean ePar = verificarPar(numero);

        if (ePar) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }
}