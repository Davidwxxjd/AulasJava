package aula08_ManipulacaoDeArquivos.exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01_CriarEscreverEmUmArquivoDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "alunos.txt";

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                String nomeAluno = scanner.nextLine();
                writer.write(nomeAluno + "\n");
            }
            System.out.println("Nomes inseridos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar ou escrever no arquivo: " + e.getMessage());
        }
    }
}