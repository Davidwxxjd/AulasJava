package aula06_MatrizesVetores.exemplos;

public class Exemplo05_MatrizComFor {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posição " + i + numeros[i]);
        }

        String[] nomes = {"Rafael", "Gislene", "Lara"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}