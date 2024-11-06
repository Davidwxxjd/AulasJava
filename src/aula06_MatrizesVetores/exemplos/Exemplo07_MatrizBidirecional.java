package aula06_MatrizesVetores.exemplos;

public class Exemplo07_MatrizBidirecional {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                System.out.println(matrizNumeros[linha][coluna]);
            }
        }
        String[][] matrizNomes = {{"Rafael", "Gislene"}, {"Lara", "Luana"},};

        for (int linha = 0; linha < matrizNomes.length; linha++) {
            for (int coluna = 0; coluna < matrizNomes[linha].length; coluna++) {
                System.out.println(matrizNomes[linha][coluna]);
            }
        }
    }
}