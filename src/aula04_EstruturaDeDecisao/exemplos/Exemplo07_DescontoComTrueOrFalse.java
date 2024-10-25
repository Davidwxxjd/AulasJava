package aula04_EstruturaDeDecisao.exemplos;

import java.util.Scanner;

public class Exemplo07_DescontoComTrueOrFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra:");
        float valorCompra = scanner.nextFloat();
        float valorTotal, desconto = 0.2f;

        valorTotal = valorCompra > 100.0f ? valorCompra - valorCompra * desconto : valorCompra;

        System.out.println("O valor total da compra é: " + valorTotal);
        scanner.close();
    }
}
