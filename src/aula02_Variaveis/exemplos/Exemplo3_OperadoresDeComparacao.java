package aula02_Variaveis.exemplos;

public class Exemplo3_OperadoresDeComparacao {
    public static void main(String[] args) {
        int num1=3, num2=7;
        boolean resposta;

        resposta = num1 > num2;
        System.out.println(num1 + ">" + num2 + "=" + resposta);
        resposta = num1 < num2;
        System.out.println(num1 + "<" + num2 + "=" + resposta);
        resposta = num1 >= num2;
        System.out.println(num1 + ">=" + num2 + "=" + resposta);
        resposta = num1 <= num2;
        System.out.println(num1 + "<=" + num2 + "=" + resposta);
        resposta = num1 == num2;
        System.out.println(num1 + "==" + num2 + "=" + resposta);
        resposta = num1 != num2;
        System.out.println(num1 + "!=" + num2 + "=" +resposta);}
}