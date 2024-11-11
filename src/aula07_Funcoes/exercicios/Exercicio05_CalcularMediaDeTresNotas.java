package aula07_Funcoes.exercicios;

public class Exercicio05_CalcularMediaDeTresNotas {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.2;

        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média do aluno é: " + media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}