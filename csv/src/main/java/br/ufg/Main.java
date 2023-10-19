package br.ufg;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import br.ufg.model.GerenciadorArquivoCSV;
import br.ufg.model.ValidadorCSV;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var validador = new ValidadorCSV().validarQuantidadeColunas("input.csv");
        var gerenciadorArquivoCSV = new GerenciadorArquivoCSV("input.csv");
        gerenciadorArquivoCSV.mapCSV("output.csv",((linha, writer) -> {

                String[] columns = linha.split(",");
                double num1 = Double.parseDouble(columns[0]);
                double num2 = Double.parseDouble(columns[1]);
                double suma = num1 + num2;
                System.out.println("" + num1 + " " + num2 + " = " + suma);

                writer.println(linha + "," + suma);


        }));

    }
}