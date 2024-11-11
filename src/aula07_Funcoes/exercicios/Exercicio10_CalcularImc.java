package aula07_Funcoes.exercicios;

public class Exercicio10_CalcularImc {
    public static void main(String[] args) {
        double peso = 70.0;
        double altura = 1.75;

        double imc = calcularIMC(peso, altura);
        System.out.println("O IMC é: " + imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}