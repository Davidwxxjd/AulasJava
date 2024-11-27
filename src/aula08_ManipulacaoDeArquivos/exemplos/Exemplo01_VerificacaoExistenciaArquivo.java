package aula08_ManipulacaoDeArquivos.exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01_VerificacaoExistenciaArquivo {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08_ManipulacaoDeArquivos\\exemplos\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo já existe!");

        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else {
                    System.out.println("Problema ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}