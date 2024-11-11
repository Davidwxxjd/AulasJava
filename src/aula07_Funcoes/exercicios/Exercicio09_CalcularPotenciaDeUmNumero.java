package aula07_Funcoes.exercicios;

public class Exercicio09_CalcularPotenciaDeUmNumero {
    public static void main(String[] args) {
        int base = 2;
        int expoente = 3;
        int resultado = calcularPotenciaIterativa(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado);
    }

    public static int calcularPotenciaIterativa(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}