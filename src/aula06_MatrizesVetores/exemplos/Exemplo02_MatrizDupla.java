package aula06_MatrizesVetores.exemplos;

public class Exemplo02_MatrizDupla {
    public static void main(String[] args) {

        int[][] matrizNumeros = new int[2][3];

        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[0][2] = 3;
        matrizNumeros[1][0] = 4;
        matrizNumeros[1][1] = 5;
        matrizNumeros[1][2] = 6;

        System.out.println("Valor da posição [0][2] = " + matrizNumeros[0][2]);
    }
}