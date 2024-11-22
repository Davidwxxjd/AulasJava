package aula08_ManipulacaoDeArquivos.exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo02_FileWriterFileReader {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08_ManipulacaoDeArquivos\\exemplos\\arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(arquivo);

            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();

            FileReader fileReader = new FileReader(arquivo);
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}