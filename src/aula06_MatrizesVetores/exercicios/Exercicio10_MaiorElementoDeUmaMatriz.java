package aula06_MatrizesVetores.exercicios;

public class Exercicio10_MaiorElementoDeUmaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {{2, 5, 1},
                          {8, 3, 9},
                          {4, 7, 6}};

        int maiorValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor na matriz é: " + maiorValor);

    }
}