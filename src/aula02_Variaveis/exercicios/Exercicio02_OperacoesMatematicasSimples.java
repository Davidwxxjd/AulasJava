package aula02_Variaveis.exercicios;

public class Exercicio02_OperacoesMatematicasSimples {
    public static void main(String[] args) {
        int horasTrabalhadas;
        int valorPorHora;

        horasTrabalhadas = 220;
        valorPorHora = 8;

        int salarioTotal = horasTrabalhadas * valorPorHora;

        System.out.println("Salário Total: R$" + salarioTotal);
    }
}
