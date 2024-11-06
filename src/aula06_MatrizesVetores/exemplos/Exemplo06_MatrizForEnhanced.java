package aula06_MatrizesVetores.exemplos;

public class Exemplo06_MatrizForEnhanced {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posição " + i + numeros[i]);
        }

        String[] nomes = {"Rafael", "Gislene", "Lara"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}