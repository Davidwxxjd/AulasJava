package aula02_Variaveis.exemplos;

public class Exemplo04_OperadoresDeComparacaoMultiplas {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 2, num4 = 6;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;
        System.out.println(num1 + "<" + num2 + "&&" + num3 + "!" + num4 + "=" + resposta);


        resposta = num1 < num2 || num3 != num4;
        System.out.println(num1 + "<" + num2 + "||" + num3 + "!" + num4 + "=" + resposta);

        resposta = !(num1 == num2);
        System.out.println("!(" + num1 + "==" + num2 + ") =" + resposta);
    }
}
