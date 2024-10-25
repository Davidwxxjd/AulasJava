package aula02_Variaveis.exercicios;

public class Exercicio04_CastingExplicito {
    public static void main(String[] args) {

        double numeroFracionado = 3.14;
        int numeroInteiro = (int) numeroFracionado;

        System.out.println("Número com decimal: " + numeroFracionado);
        System.out.println("Número convertido para inteiro: " + numeroInteiro);
    }
}