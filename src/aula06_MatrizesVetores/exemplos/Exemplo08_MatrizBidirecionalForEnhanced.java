package aula06_MatrizesVetores.exemplos;

public class Exemplo08_MatrizBidirecionalForEnhanced {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int i : matrizNumero) {
                System.out.println(i);
            }
        }
        String[][] matrizNomes = {{"Rafael", "Gislene"}, {"Lara", "Luana"},};

        for (String[] matrizNome : matrizNomes) {
            for (String s : matrizNome) {
                System.out.println(s);
            }
        }
    }
}