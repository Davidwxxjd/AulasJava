package aula05_EstruturaDeRepeticao.exercicios;

public class Exercicio06_SequenciaFibonacci {
    public static void main(String[] args) {
        int primeiro = 0, segundo = 1;
        int contador = 0;
        int limite = 10;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci são: ");

        while (contador < limite) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            contador++;
        }
    }
}