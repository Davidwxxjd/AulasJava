package aula07_Funcoes.exemplos;

public class Exemplo03_FuncaoComParametroComRetorno {
    public static void main(String[] args) {
        int soma = funcaoComParametroComRetorno(2, 2);
        System.out.println("retorno da função " + soma);
    }

    static int funcaoComParametroComRetorno(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}