package aula02_Variaveis.exercicios;

public class Exercicio09_ConversaoDeTipos {
    public static void main(String[] args) {

        float numeroFracionado = 3.14f;
        long varLong = (long) numeroFracionado;
        double varDouble = varLong;

        System.out.println("Número float: " + numeroFracionado);
        System.out.println("Número long (após casting): " + varLong);
        System.out.println("Número double (após casting): " + varDouble);
    }
}