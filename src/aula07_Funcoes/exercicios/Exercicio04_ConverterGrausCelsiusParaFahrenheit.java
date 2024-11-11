package aula07_Funcoes.exercicios;

public class Exercicio04_ConverterGrausCelsiusParaFahrenheit {
    public static void main(String[] args) {
        double celsius = 30;
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;

    }
}