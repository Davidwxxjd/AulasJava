package aula02_Variaveis.exercicios;

public class Exercicio07_OperadoresLogicosBasicos {
    public static void main(String[] args) {

        boolean verdade = true;
        boolean falso = false;
        boolean Verdade = true;

        System.out.println("Ambas condições são verdadeiras? " + (verdade && falso));
        System.out.println("Ambas condições são verdadeiras? " + (verdade && Verdade));
        System.out.println("Ambas condições são verdadeiras? " + (falso && Verdade));

        System.out.println("Alguma condição é falsa? " + (verdade || falso));
        System.out.println("Essa comparação não apresenta condição falsa? " + (verdade || Verdade));
        System.out.println("Há alguma condição verdadeira nessa comparação? " + (falso || Verdade));
    }
}