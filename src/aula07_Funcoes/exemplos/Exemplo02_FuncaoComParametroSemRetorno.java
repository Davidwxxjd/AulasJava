package aula07_Funcoes.exemplos;

public class Exemplo02_FuncaoComParametroSemRetorno {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5, "Teste");
        System.out.println("Teste");
    }

    public static void funcaoComParametroSemRetorno(int parametro1, String parametro2) {
        System.out.println("Paramêtro 1 = " + parametro1);
        System.out.println("Paramêtro 2 = " + parametro2);

    }
}