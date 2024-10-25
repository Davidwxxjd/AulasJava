package aula02_Variaveis.exercicios;

public class Exercicio10_DiferencaEntreTipos {
    public static void main(String[] args) {
        short varShort = 101;
        int varInt = varShort;
        byte varByte = (byte) varShort;

        System.out.println("Número short: " + varShort);
        System.out.println("Número int (após casting): " + varInt);
        System.out.println("Número byte (após casting): " + varByte);
    }
}